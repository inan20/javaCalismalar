package day00_Practes;

import java.util.Scanner;

public class C23_indexof {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cümle giriniz");
        String cümle = scan.nextLine();
        System.out.println("lütfen harf giriniz");
        Character harf = scan.next().charAt(0);
        if (cümle.indexOf(harf) == -1) {
            System.out.println(" cümlede harf yokdur");
        } else {
            System.out.println("cümlede harf vardır");

    }
}}