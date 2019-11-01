package com.example.lib;

public class MyClass {
    public static void main(String args[]) {
        prinTotal(100);
    }
    public static void prinTotal(int n){
        int i=(1+n)*(n)/2;
        System.out.println("n="+n);
        System.out.println("Total ="+i);
    }
}
