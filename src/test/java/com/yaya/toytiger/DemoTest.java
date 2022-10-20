package com.yaya.toytiger;

import java.util.*;
import java.util.regex.Pattern;

public class DemoTest {
    static ThreadLocal<String> localVar = new ThreadLocal<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        localVar.get();

        ArrayList alist = new ArrayList(5);
        alist.add("123");
        alist.forEach(System.out::println);


//        LinkedList<String> list = new LinkedList<>();
//        list.add(0,"1ad");
//        list.add(1,"2ad");
//        list.add(1,"3ad");
//        list.forEach(System.out::println);

//        int i= 1;
//        float f = 2f;
//        System.out.println(i%f);


//        //计算某字符出现的次数
//        String matter = "[0-9a-zA-Z_]+";
//        System.out.println("第一行");
//        String input1 = scanner.nextLine();
//        System.out.println("第二行");
//        String input2 = scanner.nextLine();
//
//        if(Pattern.matches(matter, input1)){
////            char[] chars = input1.toLowerCase().toCharArray();
////            char char2 = input2.toLowerCase().charAt(0);
////            int num = 0;
////            for (char c : chars){
////                if (c == char2){
////                    num++;
////                }
////            }
////            System.out.println("个数:" + num);
//
//            String inputLow = input1.toLowerCase();
//            String inputReplace = inputLow.replaceAll(input2.toLowerCase(), "");
//            System.out.println("个数：" + (input1.length() - inputReplace.length()));
//
//        } else {
//            System.out.println("入参错误");
//        }


//        // 字符串最后一个单词的长度
//        String input = scanner.nextLine();
//        String[] arrays = input.split(" ");
//        if (arrays != null && arrays.length > 0){
//            System.out.println("length is " + arrays[arrays.length-1].length());
//        }

    }



}
