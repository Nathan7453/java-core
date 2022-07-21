package com.nathan.core.generic_;

import com.nathan.core.generic_.coffee.*;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * 随机生成Coffee对象
 */
public class CoffeeSupplier
        implements Supplier<Coffee>, Iterable<Coffee> {

    private Class<?>[] types = {
            Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class
    };

    private final Random r = new Random(47);

    public CoffeeSupplier() {
    }

    private int size = 0;

    public CoffeeSupplier(int size) {
        this.size = size;
    }

    @Override
    public Coffee get() {
        try {
            return (Coffee) types[r.nextInt(types.length)].getConstructor().newInstance();
        } catch (InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeSupplier.this.get();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        Stream.generate(new CoffeeSupplier())
                .limit(5)
                .forEach(System.out::println);

        for (Coffee c : new CoffeeSupplier(5)) {
            System.out.println(c);
        }
    }
}
