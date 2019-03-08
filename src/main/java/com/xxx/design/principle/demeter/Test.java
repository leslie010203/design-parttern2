package com.xxx.design.principle.demeter;

/**
 * @Author Leslie
 * @Date 2019/3/8 13:03
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
