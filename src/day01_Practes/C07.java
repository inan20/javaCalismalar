package day01_Practes;

import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        { System.out.println("lütfenY/N Harfini giriniz");}
        char karakter=scan.next().charAt(0);
        if (karakter=='Y'|| karakter=='y')
        {System.out.println("yes");}
        else if (karakter=='N'|| karakter=='n'){
        System.out.println("no");}
       else {System.out.println("lütfen gecerli harf giriniz");}







    }









}
