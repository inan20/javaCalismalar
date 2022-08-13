package day01_Practes;

import java.util.Locale;
import java.util.Scanner;

public class C09 {

    public static void main(String[] args) {

     Scanner scan=new Scanner(System.in);
        System.out.println("lütfen meslek ismi giriniz");
        String meslek=scan.nextLine().toLowerCase();

        if (meslek.equals("Qalaty Tester")){
        System.out.println("Qa");}
       else if
        (meslek.equals("developer")){
            System.out.println("dev");}
        else if (meslek.equals("Busunısy Analısy"))
        {System.out.println("ba");} else if
         (meslek.equals("protac manager"))
        {System.out.println("pm");}

    else System.out.println("lütfen gecerli bir karakter giriniz");


    }}






