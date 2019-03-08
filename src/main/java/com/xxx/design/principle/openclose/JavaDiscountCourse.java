package com.xxx.design.principle.openclose;

/**
 * @Author Leslie
 * @Date 2019/3/8 9:30
 */
public class JavaDiscountCourse extends JavaCource {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
