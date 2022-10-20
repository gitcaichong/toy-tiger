package com.yaya.toytiger.thread;

import java.util.LinkedList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        LinkedList<Future<Integer>> futureList = new LinkedList();
        for (int i=0; i<3 ;i++){
            Future<Integer> future = service.submit(new NumThread());
            futureList.add(future);
        }

        for (Future<Integer> future : futureList){
            try {
                Integer integer = future.get();
                System.out.println(integer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

        }
//        Future<Integer> future = service.submit(new NumThread());

        service.shutdown();
    }
}
