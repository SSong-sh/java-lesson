package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q011 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("첫번째 숫자: ");
        String input1 = reader.readLine();
        int n1 = Integer.parseInt(input1);

        System.out.print("두번째 숫자: ");
        String input2 = reader.readLine();
        int n2 = Integer.parseInt(input2);

        String result = "";
        result = add(n1, n2);
        System.out.println(result);

        result = substract(n1, n2);
        System.out.println(result);

        result = multiply(n1, n2);
        System.out.println(result);

        result = divide(n1, n2);
        System.out.println(result);

        result = mod(n1, n2);
        System.out.println(result);

    }//main

    //add method
    public static String add(int num1, int num2) {
        String cal = "";
        int result = num1 + num2;
        cal = num1 + " + " + num2 + " = " + result;

        return cal;
    }

    //substract method
    public static String substract(int num1, int num2) {
        String cal = "";
        int result = num1 - num2;
        cal = num1 + " - " + num2 + " = " + result;

        return cal;
    }

    //multiply method
    public static String multiply(int num1, int num2) {
        String cal = "";
        int result = num1 * num2;
        cal = num1 + " * " + num2 + " = " + result;

        return cal;
    }

    //divide method
    public static String divide(int num1, int num2) {
        String cal = "";
        double result = (double) num1 / num2;  // 소수점까지 계산 -> 한 자리 까지 어떻게 하는지 모르겟음
        
        cal = num1 + " / " + num2 + " = " + result;

        return cal;
    }

    //mod method
    public static String mod(int num1, int num2) {
        String cal = "";
        int result = num1 % num2;
        cal = num1 + " % " + num2 + " = " + result;

        return cal;
    }
}
