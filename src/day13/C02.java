package day13;

import java.util.Scanner;

public class C02 {


    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı=scan.nextInt();
        for (int i = 1; i <sayı; i++) {
            System.out.print(i);
           if (i%3==0){
               System.out.println("java");}
           else if (i%5==0) {
               System.out.println("güzel");}
           else if (i%3==0&&i%5==0);
            System.out.println("java güzeldir");
           }


        }}















