package day04_Variables;

import java.util.Scanner;

public class C05_Scanner3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen ilk sayıyı giriniz");

        Double sayi1 = scan.nextDouble();
        System.out.println("lütfen ikinci sayıyı giriniz");

        Double sayi2 = scan.nextDouble();
        System.out.println("girilen sayilarin carpimi :" + sayi1 * sayi2);

    }


}







