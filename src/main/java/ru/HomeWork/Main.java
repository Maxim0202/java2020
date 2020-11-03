package ru.HomeWork;

import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        byte x = 2;
        short a = 1;
        byte b = (byte) (x + a);
        System.out.println("Ответ на задание №4: "+b);
        int z = 25;
        long c = 1892;
        int d = (int) (z * c);
        System.out.println("Ответ на задание №5: "+ d);
        int[] array =new int[]{ 892, 1093} ;
        int max = getMaxNumber(array);
        System.out.println("Ответ на задание №6: "+ max);
        isCharA();
        isCharNumber();
        isBin();
        isMax();
        isCharUni();
        isIntStr();
    }
    public static int getMaxNumber(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }
    public static void isCharA() throws IOException {
        InputStreamReader br=new InputStreamReader(System.in);
        char ch;
            ch=(char)br.read();
            if (ch=='A'){
                System.out.println("Ответ на задание №7: "+"True");
                }
            else {
                System.out.println("Ответ на задание №7: "+"False");
            }
        }
        public static void isCharNumber() throws IOException {
            InputStreamReader br=new InputStreamReader(System.in);
            char ch;
            ch=(char)br.read();
            System.out.println("Ответ на задание №8: "+Character.isDigit(ch));
        }
        public static void isBin(){
        int j =0;
        do{
            System.out.println("Ответ на задание №9: "+Integer.toBinaryString(j));
            j++;
        }
        while(j<=30);
        }
        public static void isCharUni(){
            int n =('A');
            System.out.println("Ответ на задание №11: "+n);
        }
        public static void isIntStr(){
        int t =86;
        char num =((char) t);
            System.out.println("Ответ на задание №12: "+num);
        }
        public static void isMax(){
        int i = Integer.MAX_VALUE;
        int k = Integer.MAX_VALUE+1;
            System.out.println("Ответ на задание №10: "+Integer.toBinaryString(i));
            System.out.println("Ответ на задание №10: "+Integer.toBinaryString(k));
        }
}