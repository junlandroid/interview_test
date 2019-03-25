package com.example;

import android.util.SparseArray;

/**
 * @date:2019/3/19
 * @author:junl
 * @Foreword：但行好事，莫问前程，只需努力每一天。
 * @Desc:
 */
public class Student implements Person,Cloneable{

    @Override
    public void sayHello(String content, int age) {
        System.out.println("student say hello" + content + " "+ age);

    }

    @Override
    public void sayGoodBye(boolean seeAgin, double time) {
        System.out.println("student sayGoodBye " + time + " "+ seeAgin);
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        return student;
    }
}
