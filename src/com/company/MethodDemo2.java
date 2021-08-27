package com.company;

public class MethodDemo2 {
    public static void main(String[] args) {
        boolean flag = isEvenNumber(10);
        //int result = getMax(10,20);
        //System.out.println(getMax(10,20));
        System.out.println(flag);
    }
    public static boolean isEvenNumber(int number){
        if (number%2==0){
            return true;
        }else {
            return false;
        }
    }
}
