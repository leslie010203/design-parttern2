package com.xxx.design.principle.singleresponsibility;

/**
 * @Author Leslie
 * @Date 2019/3/8 12:24
 */
public class Method {

    public void updateUserInfo(String username, String address) {
        username = "geely";
        address = "beijing";
    }

    public void updateUserInfo(String username, String... properties) {
        username = "leslie";
    }

    public void updateUserUsername(String username) {
        username = "geely";
    }

    public void updateUserAddress(String address) {
        address = "shanghai";
    }

    public void updateUserInfo(String username, String address, boolean bool) {
        if (bool) {
            //todo something1
        } else {
            //todo something2
        }
        username = "geely";
        address = "beijing";
    }


}
