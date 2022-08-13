package day25_Exceptıon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C07_Exceptıon2 {
    public static void main(String[] args) {
        String[] ürünListesi = {"Albeni", "cikolatalıGofret", "metro"};
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen ürün sıra no giriniz");
          int ürünno=0;
        try {
             ürünno = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("lütfen ürün sıra no giriniz");}

            try {
                System.out.println(ürünListesi[ürünno - 1]);

            } catch (ArrayIndexOutOfBoundsException e)
            {  System.out.println("lütfen " + ürünListesi.length + " a kadarürün no giriniz");

            }

        }

    }






