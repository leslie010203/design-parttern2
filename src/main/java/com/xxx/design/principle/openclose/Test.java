package com.xxx.design.principle.openclose;

/**
 * @Author Leslie
 * @Date 2019/3/8 9:17
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "java", 348d);
        JavaDiscountCourse javaCource = (JavaDiscountCourse)iCourse;
        System.out.println("课程ID：" + javaCource.getId() + "     课程名称:" + javaCource.getName() +"    课程原价："+javaCource.getOriginPrice()+ "   课程折扣价格：" + javaCource.getPrice());
    }
}
