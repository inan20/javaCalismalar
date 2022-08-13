package day25_Exceptıon;

import java.util.Scanner;

public class C13_trownev {
    public static void main(String[] args) {
        //Soru: Kullanicidan yasini girmesini isteyin.
        // Kodunuzu kullanici sifirdan kucuk bir sayi girerse
        // Exception verecek sekilde yazin.


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen yaş giriniz");
        int yas = scan.nextInt();
        try {


            if (yas < 0) {
                throw new IllegalArgumentException();
                 /* throw new  devoloper bazen yanlış deger girildiginde exceptıon fırlatmak istediğinde
           trow new ile yazdırır*/
            }else {
                System.out.println("yasınız"+yas);}


        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("gecerli yas giriniz");


          /* java.lang.IllegalArgumentException
            at day25_Except�on.C13_trownev.main(C13_trownev.java:14) /////FIRLATIR*/////
        }
    }
}