package com.nathan.core.random_;

import java.security.SecureRandom;

/**
 * 提供加密强随机数生成器（RNG），
 * 加密强随机数最低限度符合FIPS 140-2“加密模块的安全要求”
 *
 *   >> 支持两种RNG加密算法实现
 *      * SHA1PRNG: 算法提供者sun.security.provider.SecureRandom
 *      * NativePRNG: 提供者sun.security.provider.NativePRNG
 *
 *   >> 无论是否指定SecureRandom的初始seed，单个实例多次运行的结果也完全不同 ；
 *   >> 多个不同的SecureRandom实例无论是否指定seed，即使指定一样的初始seed，
 *   >> 同时运行的结果也完全不同
 */
public class SecureRandomDemo {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
    }
}
