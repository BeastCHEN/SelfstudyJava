package com.company;

public class MethodDemo {
    public static void main(String[] args) {
        isEvenNumber();//调用方法
    }
    public static  void isEvenNumber(){
        int number = 10 ;
        if (number%2 == 0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}

