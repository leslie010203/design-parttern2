package com.xxx.design.principle.dependencyinversion;

/**
 * @Author Leslie
 * @Date 2019/3/8 10:02
 */
public class Geely {

    private ICource iCource;


    public void setiCource(ICource iCource) {
        this.iCource = iCource;
    }

    public void studyCource() {
        iCource.studyCource();
    }

}
