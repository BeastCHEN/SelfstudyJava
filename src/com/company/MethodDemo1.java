package com.company;

public class MethodDemo1 {
    public static void main(String[] args) {
        isEvenNumber(10);
        int number = 15;
        isEvenNumber(number);
    }

    public static void isEvenNumber(int number){
        if (number%2 ==0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
