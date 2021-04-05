package cn.study.spring;

import java.util.Date;

public class Student {
    public String name;
    //配置属性的时候尽量使用包装类，保证返回值是null
    public Integer age;
    public Date createdTime;

    public Student(String name, Integer age, Date createdTime) {
        this.name = name;
        this.age = age;
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", createdTime=" + createdTime +
                '}';
    }
}
