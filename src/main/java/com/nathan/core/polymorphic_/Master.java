package com.nathan.core.polymorphic_;

public class Master {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Master(String name) {
        this.name = name;
    }

//    public void feed(Dog dog, Bone bone) {
//        String msg = String.format("主人[%s]给小狗[%s]喂食[%s]", name, dog.getName(), bone.getName());
//        System.out.println(msg);
//    }

//    public void feed(Cat cat, Fish fish) {
//        String msg = String.format("主人[%s]给小狗[%s]喂食[%s]", name, cat.getName(), fish.getName());
//        System.out.println(msg);
//    }

    public void feed(Animal animal, Food food) {
        String msg = String.format("主人[%s]给小狗[%s]喂食[%s]", name, animal.getName(), food.getName());
        System.out.println(msg);
    }
}
