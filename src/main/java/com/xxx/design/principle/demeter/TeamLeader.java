package com.xxx.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Leslie
 * @Date 2019/3/8 12:58
 */
public class TeamLeader {

    public void checkNumberOfCourses() {
        List<Course> list = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            list.add(new Course());
        }
        System.out.println("在綫課程的數量:" + list.size());
    }


}
