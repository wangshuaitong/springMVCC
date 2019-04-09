package com.test;

import org.junit.Test;

public class TestJunit {

    @Test
    public void testFirst(){

        //测试方法
        System.out.println("结果输出："+(100+200));

        int i;

        for(i=0; i<10; i++){

            System.out.println(i);
        }

        System.out.println(i+"sdfsdf");
    }
}
