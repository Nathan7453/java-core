package com.nathan.core.exception_;

import java.util.Arrays;

public class DynamicFields {
    private Object[][] fields;

    public DynamicFields(int initialSize) {
        fields = new Object[initialSize][2];
        for (int i = 0; i < initialSize; i++) {
            Arrays.fill(fields[i], null);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Object[] field : fields) {
            result.append(field[0])
                    .append(": ")
                    .append(field[1])
                    .append("\n");
        }
        return result.toString();
    }

    private int hasFields(String id) {
        for (int i = 0; i < fields.length; i++) {
            if (id.equals(fields[i][0])) {
                return i;
            }
        }
        return -1;
    }

    private int getFieldNumber(String id) throws NoSuchFieldException {
        int fieldNum = hasFields(id);
        if (fieldNum == -1) {
            throw new NoSuchFieldException();
        }
        return fieldNum;
    }

    private int makeField(String id) {
        for (int i = 0; i < fields.length; i++) {
            if(fields[i][0] == null) {
                fields[i][0] = id;
                return i;
            }
        }

        // 没有空的数据项，则添加一个
        Object[][] tmp = new Object[fields.length + 1][2];
        System.arraycopy(fields, 0, tmp, 0, fields.length);
        for (int i = fields.length; i < tmp.length; i++) {
            Arrays.fill(tmp[i], null);
        }
        fields = tmp;

        // 扩展后递归调用
        return makeField(id);
    }

    public Object getField(String id) throws NoSuchFieldException {
        return fields[getFieldNumber(id)][1];
    }

    public Object setField(String id, Object value) throws DynamicFieldsException {
        if (value == null) {
            DynamicFieldsException dfe = new DynamicFieldsException();
            dfe.initCause(new NullPointerException());
            throw dfe;
        }

        int fieldNumber = hasFields(id);
        if (fieldNumber == -1) {
            fieldNumber = makeField(id);
        }

        Object result = null;
        try {
            result = getField(id);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        fields[fieldNumber][1] = value;
        return result;
    }

    public static void main(String[] args) {
        DynamicFields df = new DynamicFields(3);
        System.out.println(df);
        try {
            df.setField("d", "A value for d");
            df.setField("number", 47);
            df.setField("number2", 48);
            System.out.println(df);

            df.setField("d", "A new value for d");
            df.setField("number3", 11);
            System.out.println("df: " + df);
            System.out.println("df.getField(\"d\"): " + df.getField("d"));
            Object field = df.setField("d", null); // 异常
        } catch (DynamicFieldsException e) {
            e.printStackTrace(System.out);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}

class DynamicFieldsException extends Exception {}
