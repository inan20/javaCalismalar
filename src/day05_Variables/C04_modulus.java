package day05_Variables;

import java.util.Scanner;

public class C04_modulus {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");

        int sayi= scan.nextInt();// 1265

         int birlerBasamağı=0;
         int sayılarToplamı=0;

         birlerBasamağı=sayi%10;
        sayılarToplamı+=birlerBasamağı;
        sayi/=10;// 1265 b basamaği 5 //

        birlerBasamağı=sayi%10;// 126 b bsamaği 6 top 11
        sayılarToplamı+=birlerBasamağı;
        sayi/=10; //

         birlerBasamağı=sayi%10;// 12 b bsamaği 2 top 13//
        sayılarToplamı+=birlerBasamağı;
         sayi/=10;

        birlerBasamağı=sayi%10; // 1 bas 13+1=12
        sayılarToplamı+=birlerBasamağı;
        System.out.println("sayılarToplamı:"+sayılarToplamı);






    }




}
