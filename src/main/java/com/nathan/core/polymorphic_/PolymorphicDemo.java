package com.nathan.core.polymorphic_;

public class PolymorphicDemo {


    public static void main(String[] args) {
        // ①和②是方法重载: 后续扩展会导致代码冗余，不利于代码维护
        // [演示时将重载的方法注释]③是上面问题的解决方案: 对象多态

        Master master = new Master("老哥");

        Dog dog = new Dog("小黄");
        Bone bone = new Bone("大棒骨");
        master.feed(dog, bone); // ① --> 注释重载后为③

        Cat cat = new Cat("小黑");
        Fish fish = new Fish("小鳗鱼");
        master.feed(cat, fish); // ② --> 注释重载后为③
    }
}
