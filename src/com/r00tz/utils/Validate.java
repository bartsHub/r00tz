package com.r00tz.utils;

public class Validate {
    public static boolean checkUser(String email, String pass) {
        boolean st = false;
        try {

            if (pass.equals("ekim")) {
                st = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return st;
    }
}