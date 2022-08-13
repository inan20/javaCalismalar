package day07;

import java.util.Scanner;

public class C03_ıfStatemens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gün ismi gırınız");
        String günİsmi = scan.nextLine();
        if (günİsmi.equals("pazartesi")) {
            System.out.println("PAZ");
        } else if (günİsmi.equals("salı")) {
            System.out.println("SAL");
        } else if (günİsmi.equals("çarsamba")) {
            System.out.println("CAR");
        } else if (günİsmi.equals("persembe")) {
            System.out.println("PER");
        } else if (günİsmi.equals("cuma")) {
            System.out.println("CUM");
        } else if (günİsmi.equals("cumartesi")) {
            System.out.println("CUM.");
        } else if (günİsmi.equals("pazar")) {
            System.out.println("PAZ");
        } else {
            System.out.println("lutfen gcerli isim giriniz");
        }


    }}