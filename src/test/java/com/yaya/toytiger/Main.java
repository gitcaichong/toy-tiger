package com.yaya.toytiger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num <= 1){
            System.out.println("输入错误");
        }

        int count = 0;
        for (int i = 2; i<=num; i++){
            int num1 = 0;
            for (int j =2 ; j< i;j++){
                if (i%j == 0){
                    num1++;
                }
                if (num1 > 0){
                    break;
                }
            }
            if (num1 == 0){
                count++;
            }
        }
        System.out.println(count);
    }

}
