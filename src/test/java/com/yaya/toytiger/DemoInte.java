package com.yaya.toytiger;

public interface DemoInte {
    static void doSome(){
        System.out.println("ss");
    }

    default void deme(){
        System.out.println("dds");
    }

}
