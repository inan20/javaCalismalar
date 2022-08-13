package day05_Variables;

import java.util.Scanner;

public class C01_Concatınanıon {

    public static void main(String[] args) {
        String str="javaya hosgeldiniz";
        System.out.println(str.toUpperCase());

         Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sifre giriniz");

         String sifre=scan.nextLine();
         Integer sifreSayi=Integer.parseInt(sifre);

        System.out.println("lutfen sire giriniz:"+"  "+sifre);
        System.out.println("lutfen sifre giriniz:"+"  "+sifreSayi);
        System.out.println("lutfen sifreyi 3 artırınız"+"  "+sifre);
        System.out.println("lutfen sifreyi 3 artırınız"+"  "+ (3+sifreSayi) );


     }





 }
