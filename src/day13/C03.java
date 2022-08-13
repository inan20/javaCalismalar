package day13;

import java.util.Scanner;

public class C03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen sayı giriniz");
        int sayı1 = scan.nextInt();
        System.out.println("lütfen sayı giriniz");
        int sayı2 = scan.nextInt();

        aralarındakiniTopla(sayı1, sayı2);

    }

    private static void aralarındakiniTopla(int sayı1, int sayı2) {
        int toplam=0;
        for (int i = sayı1; i <sayı2 ; i++) {
            toplam+=i;
            System.out.println(toplam);
        }




    }
}
