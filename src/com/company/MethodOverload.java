package com.company;
//方法重载
public class MethodOverload {
    public static void main(String[] args) {
        int result=sum(10,20);
        System.out.println(result);
        double result1=sum(10.0,20.0);
        System.out.println(result1);
        int result2=sum(10,20,30);
        System.out.println(result2);
    }
    public static int sum(int a,int b){
        return  a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
}
