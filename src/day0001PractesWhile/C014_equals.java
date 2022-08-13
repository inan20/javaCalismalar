package day0001PractesWhile;

import java.util.Scanner;

public class C014_equals {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen cümle giriniz");
        String cümle=scan.nextLine();
        System.out.println("lütfen 2.cümleyi giriniz");
        String cümle2=scan.nextLine();
        System.out.println(cümle.equalsIgnoreCase(cümle2));







    }}