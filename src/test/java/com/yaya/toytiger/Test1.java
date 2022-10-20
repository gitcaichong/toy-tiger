package com.yaya.toytiger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        String str="12sd39d9";
//        isNumeric(str);
        getNum(str);
    }


    //判断一个字符串是否为数字
    public static void isNumeric(String str){
        for (int i =  str.length(); --i>=0;) {
            if(Character.isDigit(str.charAt(i))){
                System.out.println(str.charAt(i));
            }
        }
    }


    public static void getNum(String str){
        Pattern pattern = Pattern.compile("[^0-9]");
        Matcher matcher = pattern.matcher(str);
        String result = matcher.replaceAll("");
        System.out.println(result);
    }

}
