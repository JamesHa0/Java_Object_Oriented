package java1031;

import java.io.Serializable;

public class Person implements Serializable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }
    void show(){
        System.out.println("这个人是："+this.name);
    }
}
