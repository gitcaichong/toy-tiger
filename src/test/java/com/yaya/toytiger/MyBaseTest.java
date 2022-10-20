package com.yaya.toytiger;

import org.assertj.core.data.MapEntry;
import sun.nio.cs.Surrogate;
import sun.rmi.log.LogInputStream;

import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.regex.Pattern;

public class MyBaseTest {

    String str = "私熟";
    char[] arr = {'a', 'b', 'c'};

    private static Random r = new Random();

    public static void main(String[] args) {





//        String sb = "Hello nowcoder ";
//        String[] sp = sb.split(" ");
//
//        for(String s : sp){
//            System.out.println(s);
//        }
//        System.out.print(sp[sp.length-1].length());
//
//        int[] a = new int[]{57, 68, 59, 52};


//        // 插入排序
//        //待插入元素
//        for (int i = 1; i < a.length; i++) {
//            int temp = a[i];
//            int j;
//            //将大于temp的往后移动一位
//            for (j = i - 1; j >= 0; j--) {
//                if (a[j] > temp) {
//                    a[j + 1] = a[j];
//
//                } else {
//                    break;
//                }
//            }
//            System.out.println(j);
//            a[j + 1] = temp;
//        }
//        for(int b : a){
//            System.out.println(b);
//        }
//    }


//        //冒泡排序算法
//        int[] numbers = new int[]{1, 5, 8, 2, 3, 9, 4};
//        //需进行length-1次冒泡
//        for (int i = 0; i < numbers.length - 1; i++) {
//            for (int j = 0; j < numbers.length - 1 - i; j++) {
//                if (numbers[j] > numbers[j + 1]) {
//                    int temp = numbers[j];
//                    numbers[j] = numbers[j + 1];
//                    numbers[j + 1] = temp;
//                }
//            }
//        }
//        System.out.println("从小到大排序后的结果是:");
//        for (int i = 0; i < numbers.length; i++)
//            System.out.print(numbers[i] + " ");




//        List<StringAddress> list = new ArrayList<>(
//                Collections.nCopies(3,new StringAddress("Hello"))
//        );
//        System.out.println(list);
//        StringAddress a = list.get(0);
//        Collections.fill(list,new StringAddress("Hello"));
//        System.out.println(list);
//        System.out.println(a == list.get(0));
//        System.out.println(a.equals(list.get(0)));
//


//        for(Map.Entry entry : System.getenv().entrySet()){
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }

//        ConsumerMapper mapper = new ConsumerTest();
//        ((ConsumerTest) mapper).updateBy();//需要向下转型才可以使用实现类方法
//
//
//        Collection snow = new ArrayList<Snow>();
//        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
////        snow1.add(new Crusty());//长度不可变，运行时会报错
//
//        System.out.println(snow1.size());
//        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
//        List<Snow> snow3 = new ArrayList<Snow>();
//        Collections.addAll(snow3, new Light(), new Heavy());
//        List<Snow> sonw4 = Arrays.<Snow>asList(new Light(), new Heavy());

//        List<String> list = new ArrayList<String>();
//        List<String> list2 = new LinkedList<String>();
//        String str = "私熟";
//        String str2 = "私熟1";
//        list.add(str);
//        list.add(str);
//        list.add(str2);
//        System.out.println(list.size());
//        System.out.println(list.get(0) == list.get(1));
//        System.out.println(list.get(1) == list.get(2));
//        for (String s : list){
//            System.out.println(s);
//        }

//        System.out.println(r.nextInt(10));

//        String s = "01234abcd";
//        System.out.println(replaceAll(s, "[a-z]", "CX"));

//        int a=10;
//        int b=20;
//        swap(a,b);
//        System.out.println("a="+a+",b="+b);
//
//
//        ConsumerEntity te = new ConsumerEntity();
//        te.exchange(te.str, te.arr);
//        System.out.print(te.str + " ");
//        System.out.print(te.arr);


//        String sd = String.valueOf(11 + "2");

//        short s1 = 1; s1 = s1 + 1;
//        short s1 = 1;
//        s1 += 1;

//        int i = 5;
//        switch (i) {
//            default:
//                System.out.println("default");
//            case 0:
//                System.out.println(0);
//                break;
//            case 1:
//                System.out.println(1);
//                break;
//            case 2:
//                System.out.println(2);
//                break;
//        }
    }

    public void exchange(String str, char arr[]) {
        str = "2";
        arr[0] = 'd';
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x=" + x + ",b=" + y);
    }

    public static String replaceAll(String s, String regex, String replacement) {
        return Pattern.compile(regex).matcher(s).replaceAll(replacement);
    }
}

