package Task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
       // static variables are shared among all objects
        // instance variable belong to the object
        byte b = 10 ;   // memory space 1 byte
        short s = 100 ;   // memory space 2 byte
        int i = 1000;    // memory space 4 byte
        long l = 10L;   // memory space 8  byte
        float f = 10.5f;   // memory space 4 byte
        double d =  99.99;    // memory space 8 byte
        char c = 'a';      // memory space 2  byte
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two float numbers :");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float sum = num2 + num1;
        System.out.println(sum);
        float m = num1 * num2;
        System.out.println(m);
        float n = num1 - num2 ;
        System.out.println(n);
        float div = num1/ num2 ;
        System.out.println(div);
        // What is Type Casting?
        //Converting one data type to another
        int num = (int) 10.9f;



} }

