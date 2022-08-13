package day00_Practes;

import java.util.Scanner;

public class C12_VKİ {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println( "lütfen kilonuzu giriniz");
        Double kilo=scan.nextDouble();
        System.out.println("lütfen boyunuzu giriniz");
        Double boy=scan.nextDouble();
        double vkisonuç=kilo/(boy*boy);
        boy/=100;
       if (vkisonuç< 10){
           System.out.println("zayıf");}
           else if(vkisonuç<20){
           System.out.println("normal");
           } else {
           System.out.println("şişman");

    }
}}