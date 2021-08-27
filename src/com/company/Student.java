package com.company;

public class Student {
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age) {
        this.age=age;
        if (age < 0 || age > 120) {
            System.out.println("你给的年龄有误！");
        } else {
            age = age;
        }
    }
    public int getAge() {
        return age;
    }
    public void show(){
        System.out.println(name+","+age);
    }
}
