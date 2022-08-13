package day08;

import java.util.Scanner;

public class C06_NestedTernery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char harf = scan.next().charAt(0);

        if (harf > 'a' && harf < 'z') {
            System.out.println("küçük harf");
        } else if (harf > 'A' && harf < 'Z') {
            System.out.println("Büyük Harf");
        } else {
            System.out.println("gidğiniz karakter Harf Değil");
        }
    }}












