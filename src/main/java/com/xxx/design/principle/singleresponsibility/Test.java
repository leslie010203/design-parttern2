package com.xxx.design.principle.singleresponsibility;

/**
 * @Author Leslie
 * @Date 2019/3/8 12:01
 */
public class Test {
    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMode("大雁");
//        bird.mainMoveMode("鸵鸟");

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("企鹅");


    }
}
