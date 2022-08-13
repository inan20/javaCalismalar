package day25_Exceptıon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C06_Exceptıon {
    public static void main(String[] args) {


        String[] ürünler = {"çay", "biskuvi", "kek", "cikolata"};
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen ürün numarası giriniz");


        try { int ürünNo=scan.nextInt();
            System.out.println(ürünler[0]);// System.out.println(ürünler[ürünNo-1]);*/

        } catch ( InputMismatchException e) {
            System.out.println("gecerli sayı giriniz");

        }


    }
}