package day00_Practes;

import java.util.Scanner;

public class C24_İndxof {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfenbir cümle giriniz");
        String cümle=scan.nextLine();
        System.out.println("lütfen bir harf giriniz");
         String kelime=scan.next();
        if (cümle.indexOf(kelime)==-1)
        { System.out.println("cümlede kelime kullanılmamıştır");}
        else if (cümle.indexOf(kelime)==cümle.lastIndexOf(kelime))  {
            System.out.println("cümlede bir defa kullanılmıştır");}
        else {
            System.out.println("birden çok kullanılmıştır");
    }















}}
