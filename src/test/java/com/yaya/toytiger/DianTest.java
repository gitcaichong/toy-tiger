package com.yaya.toytiger;


import java.sql.SQLOutput;
import java.util.*;

public class DianTest {

    private static Map<String,String> map = new HashMap<>();
    //静态初始化、加载map容器
    static{
        map.put("1","1");
        map.put("abc","2");
        map.put("def","3");
        map.put("ghi","4");
        map.put("jkl","5");
        map.put("mno","6");
        map.put("pqrs","7");
        map.put("tuv","8");
        map.put("wxyz","9");
        map.put("0","0");
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        while(in.hasNext()){
            String str = in.nextLine();
            char[] chars = str.toCharArray();
            //构造buffer容器存储转换后的字符串
            StringBuffer buffer = new StringBuffer();
            for(char c : chars){
                //如果是正整数则不需要进行加密
                if(c>='0'&& c<='9'){
                    buffer.append(String.valueOf(c));
                }else if(c>='A'&& c<='Y'){ //如果是A~Y的大写字母则需要将其+32位转换成小写再向后移1位
                    char newChar = (char)(c+32+1);
                    buffer.append(String.valueOf(newChar));
                }else if(c=='Z'){ //如果是Z则加密成a
                    buffer.append("a");
                }else{
                    //去除map容器中的key与字符进行校验并加密
                    Set<String> keys = map.keySet();
                    for(String k : keys){
                        if(k.contains(String.valueOf(c)))
                            buffer.append(map.get(k));
                    }
                }
            }
            System.out.print(buffer.toString());
        }


//        String ss = "12321200";
//        StringBuffer sb = new StringBuffer(ss);
//        System.out.println(sb.reverse());

//        // 注意 hasNext 和 hasNextLine 的区别
//        int temp = 0;
//        int countN = 0;
//        int countP = 0;
//        double sum = 0.0;
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            temp = in.nextInt();
//            if(temp<0){
//                countN++;
//            }else if(temp>0){
//                countP++;
//                sum += temp;
//            }
//        }
//        System.out.println(countN);
//        if(countP==0){
//            System.out.printf("0.0");
//        }else{
//            System.out.printf("%.1f\n",sum/countP);
//        }


//        System.out.println("abc def aaa bbb".replaceAll("(\\w+)\\s+(\\w+)", "$2 $1"));
//        System.out.println("abc def aaa bbb vvv ddf".replaceAll("(\\w+)\\s+(\\w+)", "$2 $1"));

//        String  ss = "aaddccdc";
//        Map<Character, Integer> map = new HashMap<>();
//        char[] chars = ss.toCharArray();
//        for (char c : chars){
//            map.put(c , map.getOrDefault(c, 0) + 1);
//        }
//        map.entrySet().stream().sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue())).forEach(entry -> System.out.print(entry.getKey()));
//        int n = in.nextInt();
//        int[][] result = new int[n][];
//        int t = 1;
//        for (int i =0 ; i< n; i++){
//            result[i] = new int[n-i];
//            for (int j =0 ; j<=i ; j++){
//                result[i-j][j]=t;
//                t++;
//            }
//
//        }
//        for (int[] a : result){
//            for (int a1 : a){
//                System.out.print(a1 + " ");
//            }
//            System.out.println();
//        }



//        while (in.hasNextLine()) {
//            String str = in.nextLine();
//            String res = reverse(str);
//            System.out.println(res);
//        }

//        System.out.println(Math.round(11.5));
//        System.out.println(Math.round(-11.5));


//        long c = 123L;
//        float d = 0.9934f;


//        System.out.println(5%2);
//        System.out.println(5/2);

//        int x = 0;
//        int y = 0;
//        int k = 0;
//        for (int z = 0; z<5; z++){
//            if ((++x > 2)&&(++y > 2)&&(k++ > 2)){
//                x++;
//                ++y;
//                k++;
//            }
//        }
//        System.out.println(x + " " + y + " " + k);

//        Integer i1 = Integer.valueOf(147);
//        Integer i2 = Integer.valueOf(147);
//        Integer i3 = Integer.valueOf(47);
//        Integer i4 = Integer.valueOf(47);
//        System.out.println(i1 == i2 );
//        System.out.println(i3 == i4 );

//        Integer n1 = new Integer(47);
//        Integer n2 = new Integer(47);
//        System.out.println(n1 == n2);


//        System.out.println(isAdmin("Admin"));
//        System.out.println(isAdmin("admin"));

//        String s = "tommy";
//        Object o = s;
//        sayHello(o);
//        sayHello(s);


//        StringBuffer s1 = new StringBuffer("Hello");
//        StringBuffer s2 = new StringBuffer("World");
//
//        test(s1, s2);
//        System.out.println("s1:" + s1);
//
//        System.out.println("s2:" + s2);

    }

    private static void test(StringBuffer s1, StringBuffer s2) {
        s1.append(s2);
        System.out.println(s1);
        s2 = s1;
        s2.append("2222");
    }

    private static void sayHello(Object to) {
        System.out.println(String.format("Welcome, %s", to));
    }

    private static void sayHello(String to) {
        System.out.println(String.format("Hello, %s", to));
    }

    public static boolean isAdmin(String userId) {
        return userId.toLowerCase() == "admin";
    }

    public static String reverse(String str) {
        // 匹配非字母的字符进行分割
        String[] words = str.split("[^A-Za-z]+");
        StringBuilder result = new StringBuilder();

        // 逆序添加分割完的单词
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }
        return result.toString().trim();
    }
}
