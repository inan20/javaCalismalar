package day0_Practes;

import java.util.Scanner;

public class C02_ÜçBsamaklı {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı gieiniz");
        int sayı = scan.nextInt();
        if (sayı >= 100 && sayı < 1000) {
            System.out.println("sayı üç basamaklıdır");
        } else {
            System.out.println("sayı  üç basamaklı değildir");
        }
    }
}