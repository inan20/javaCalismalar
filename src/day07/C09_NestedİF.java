package day07;

import java.util.Scanner;

public class C09_NestedİF {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen sifre giriniz");
        String sifre = scan.next();
        char ilkharf = scan.next().charAt(0);
        if (ilkharf > 'A' && ilkharf < 'Z')
            if (ilkharf == 'A') {
                System.out.println("gecerli şifre");
            } else {
                System.out.println("gecersiz sifre");
            }

        else if (ilkharf > 'a' && ilkharf < 'z') ;
        if (ilkharf == 'z') {
            System.out.println("gecerli sifre");
        } else {
            System.out.println("gecersiz sifre");
        }

    }}




