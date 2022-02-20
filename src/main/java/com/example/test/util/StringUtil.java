package com.example.test.util;

public class StringUtil {
    
    public static String repeat(String string, int times){
        if(times < 0){
            throw new IllegalArgumentException("negative times not allowed");
        }
        
        String result = "";

        for (int i = 0; i < times; i++) {
            result += string;
        }
        return result;
    }
    
    public static boolean isEmpty(String string){
        return string == null || string.trim().isEmpty();
    }
}