package com.xxx.design.principle.dependencyinversion;

/**
 * @Author Leslie
 * @Date 2019/3/8 10:23
 */
public class FECource implements ICource {

    @Override
    public void studyCource() {
        System.out.println("学习前端");
    }
}
