package day00_Practes;

import java.util.Scanner;

public class C02_Swithc {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı girniz");
        int günSayi=scan.nextInt();


        switch (günSayi){
            case 1:
            System.out.println("pazartesi");
            break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
            default:
                System.out.println("lutfen gecerli bir sayi giriniz");
    }

}}
