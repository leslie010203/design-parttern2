package com.xxx.design.principle.dependencyinversion;

/**
 * @Author Leslie
 * @Date 2019/3/8 10:04
 */
public class Test {
    //v1
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyJavaCourse();
//        geely.studyFECource();
    //v2
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyCource(new JavaCource());
//        geely.studyCource(new FECource());
//    }
    //v3
    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.setiCource(new JavaCource());
        geely.studyCource();
    }






}
