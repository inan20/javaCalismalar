package day0001PractesWhile;

import java.util.Scanner;

public class C01_Buyuk_harf_gir {
    public static void main(String[] args) {

		 /* Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada
		  hatali giris seklinde kod yazniz*/

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen harf giriniz");
        Character harf = scan.next().charAt(0);
        if (harf > 'A' && harf < 'Z') {
            System.out.println("girilen harf buyuk");}
            else if (harf > 'a' && harf < 'z') {
                System.out.println("girilen harf kucuk");}
                else if (harf < 'A' || harf > 'Z' || harf < 'A' || harf >'Z') {
                    System.out.println("lutfen gecerli karakter giriniz");
                }
            }
        }