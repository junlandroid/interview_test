package com.example;

import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import org.junit.Test;

import java.util.LinkedHashMap;

/**
 * @date:2019/3/19
 * @author:junl
 * @Foreword：但行好事，莫问前程，只需努力每一天。
 * @Desc:
 */
public class Student implements Person {


    @Override
    public void sayHello(String content, int age) {
        System.out.println("student say hello" + content + " " + age);

    }

    @Override
    public void sayGoodBye(boolean seeAgin, double time) {
        System.out.println("student sayGoodBye " + time + " " + seeAgin);


    }

    @Test
    public void Test() {

        LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer, String>(){
            {
                put(1, "hello");
                put(2, "world");
                put(3, "junl");
            }
        };

        System.out.println();


        handler.post(new Runnable() {
            @Override
            public void run() {

            }
        });

    }

    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };
}
