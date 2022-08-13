package day00_Practes;

import java.util.Scanner;

public class C11_str_Manipü {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cümle=scan.nextLine();
        System.out.println("lütfrn harf giriniz");
        Character harf=scan.next().charAt(0);
        int harf1=cümle.indexOf(harf);
        if (harf1==-1){
        System.out.println("harf1 yoktur");}
        else {
            System.out.println("harf vardır");


    }





}}

