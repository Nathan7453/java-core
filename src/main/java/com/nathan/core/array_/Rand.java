package com.nathan.core.array_;

import java.util.Arrays;
import java.util.SplittableRandom;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

/**
 * 随机数生成器
 */
public interface Rand {

    int MOD = 10_000;

    class Long implements Supplier<java.lang.Long> {
        SplittableRandom r = new SplittableRandom(47);

        @Override
        public java.lang.Long get() {
            return r.nextLong(MOD);
        }

        public java.lang.Long[] array(int sz) {
            long[] primitive = new Plong().array(sz);
            java.lang.Long[] result = new java.lang.Long[sz];
            for (int i = 0; i < sz; i++) {
                result[i] = primitive[i];
            }
            return result;
        }
    }

    class Plong implements LongSupplier {
        SplittableRandom r = new SplittableRandom(7);

        @Override
        public long getAsLong() {
            return r.nextLong(MOD);
        }

        public long get(int n) {
            return getAsLong();
        }

        public long[] array(int sz) {
            return r.longs(sz, 0, MOD).toArray();
        }
    }

    class String implements Supplier<java.lang.String> {
        SplittableRandom r = new SplittableRandom(47);
        private int strlen = 7;

        public String() {
        }

        public String(int strlen) {
            this.strlen = strlen;
        }

        @Override
        public java.lang.String get() {
            return r.ints(strlen, 'a', 'z' + 1)
                    .collect(StringBuilder::new,
                            StringBuilder::appendCodePoint,
                            StringBuilder::append)
                    .toString();
        }

        public java.lang.String get(int n) {
            return get();
        }

        public java.lang.String[] array(int sz) {
            java.lang.String[] result = new java.lang.String[sz];
            Arrays.setAll(result, n -> get());
            return result;
        }
    }
}
