package com.yaya.toytiger;

import com.yaya.toytiger.entity.ConsumerEntity;
import com.yaya.toytiger.mapper.ConsumerMapper;
import com.yaya.toytiger.service.ConsumerServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ToyTigerApplicationTests {

    @Autowired
    ConsumerMapper consumerMapper;

    @Test
    public void selectById() {
        ConsumerEntity entity = consumerMapper.selectById(1);
        System.out.println("------" + entity.getName());
    }

    @Test
    public void updateById() {

        String hello = "Hello", lo = "lo";
        System.out.print((hello == ("Hel"+"lo")) + " ");
        System.out.print((hello == ("Hel"+lo)) + " ");
        System.out.print((hello == ("Hel"+lo).intern()) + " ");


//        Integer i1 = 100;
//        Integer i2 = 100;
//        Integer i3 = 200;
//        Integer i4 = 200;
//        int i5 = 100;
//        System.out.println(i1==i5); //打印true
//        System.out.println(i1==i2); //打印true
//        System.out.println(i3==i4); //打印false


//        ConsumerEntity entity = new ConsumerEntity();
//        entity.setId(1);
//        entity.setAge(21);
//        System.out.println(consumerMapper.updateById(entity));
//        System.out.println(Math.round(-1.5));

//        String str="i";
//        String str1=new String("i");
//        System.out.println(str.equals(str1));
//        System.out.println(str==str1);


//        String ss="asdgaasf";
//        System.out.println(ss.indexOf("S"));
//        System.out.println(ss.indexOf("a"));
//        System.out.println(ss.indexOf("d"));
//        byte[] bytes = ss.getBytes();
//        for(byte i : bytes){
//            System.out.println(i);
//        }


    }

}
