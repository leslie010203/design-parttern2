package com.xxx.design.principle.demeter;

/**
 * @Author Leslie
 * @Date 2019/3/8 12:58
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourses();
    }


}
