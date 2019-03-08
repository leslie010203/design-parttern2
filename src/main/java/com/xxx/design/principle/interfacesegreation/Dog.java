package com.xxx.design.principle.interfacesegreation;

/**
 * @Author Leslie
 * @Date 2019/3/8 12:35
 */
public class Dog implements IEatAnimalAction,ISwimAnimalAction {

    @Override
    public void eat() {
        System.out.println("狗吃");
    }

    @Override
    public void swim() {
        System.out.println("狗游泳");
    }
}
