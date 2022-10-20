package com.yaya.toytiger;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String org = input.nextLine();
        if (org.startsWith("0")){
            System.out.println("Invalid input.");
            return;
        }
        String patters="-?[0-9]+";
        if (!Pattern.matches(patters, org)){
            System.out.println("Invalid input.");
            return;
        }

        try {
            Integer orgi =  Integer.valueOf(org);
            String outs = Integer.toHexString(orgi);
//            System.out.println(outs);
            if (outs.length()<8){
                StringBuilder sb = new StringBuilder();
                for (int i =0 ; i<8-outs.length(); i++){
                    sb.append("0");
                }
                sb.append(outs);
                outs = sb.toString();

            }
            for (int i = 0; i < 4; i++){
                System.out.print(outs.substring(i*2,(i+1)*2));
                System.out.print(" ");
            }
            System.out.println();
            for (int i = 4; i > 0; i--){
                System.out.print(outs.substring((i-1)*2,i*2));
                System.out.print(" ");
            }

        } catch (Exception e){
            System.out.println("Out of range.");
        }
    }
}
