package com.test.question;

import java.util.Scanner;

public class Q069 {

    public static void main(String[] args) {


        
        Scanner scan = new Scanner(System.in);

        System.out.print("배열의 길이: ");

        int arrayLength = scan.nextInt(); //배열의 길이 입력받기
        

        int[] list = new int[arrayLength]; //입력 받은 값을 list의 배열 길이로 지정
        int[] copy = new int[(int)Math.ceil(arrayLength/2)]; //list의 배열 길이를 반으로 나눠서 지정 (반올림)

        
        // 1~20까지의 난수를 list안에 반복해서 넣어주기
        for (int i = 0; i < list.length; i++) {
            int random = (int) (Math.random() * 20) + 1;
            list[i] = random;
        }

        //원본 리스트 출력
        System.out.print("원본: ");
        array(list);
        
        
        //copy 배열에 값 넣어주기
        // 0부터 시작해 2씩 증가하면서 list의 배열 값을 더해줌
        // length-1 이유는 홀수번째 요소는 남기고 짝수 번째 요소만 처리하기 위함
        for (int i = 0; i < list.length - 1; i += 2) {
            copy[i / 2] = list[i] + list[i + 1];
        }

        //list가 홀수일 경우 list의 마지막 값을 copy의 마지막 값으로 설정
        if (list.length % 2 == 1) {
            copy[copy.length - 1] = list[list.length - 1];
        }

        System.out.print("결과: ");
        array(copy);
    }

    private static void array(int[] list) {
        String temp = "[ ";
        for (int i = 0; i < list.length; i++) {
            temp += list[i] + ", ";
        }
        temp += "]";
        System.out.println(temp);
    }
}
