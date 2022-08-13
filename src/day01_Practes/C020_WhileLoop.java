package day01_Practes;

import java.util.Scanner;

public class C020_WhileLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = scan.nextInt();
        int count = 0;
        while (sayı > 0) {
            if (sayı % 2 == 1) {
                System.out.println(sayı);
                count++;
            }
            sayı--;
        }
        System.out.println(count);
    }}