package com.nathan.core.array_;

import java.util.ArrayList;
import java.util.List;

/**
 * 编译器不允许直接实例化泛型数组，但允许创建此类数组的引用
 */
public class ArrayOfGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String>[] ls;
        List[] la = new List[10];
        ls = (List<String>[])la;
        ls[0] = new ArrayList<>();

//        ls[1] = new ArrayList<Integer>();

        // List<String> 是Object的子类
        Object[] objects = ls;
        objects[1] = new ArrayList<>();

    }
}
