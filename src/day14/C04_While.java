package day14;

import java.util.Scanner;

public class C04_While {
    public static void main(String[] args) {
             /*
        Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
        islemi bitirmek icin 0’a basmasini soyleyin.
        Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        ve “Negatif sayi giremezsiniz” yazdirip basa donun
        Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        yanlislikla kac negative sayi girdigini ve
        girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
         */

        int sayı = 0;
        int toplam = 0;
        int sayac = 0;
        Scanner scan = new Scanner(System.in);

        do {  System.out.println("sayı girniz");
            sayı = scan.nextInt();
            if (sayı>0) {
                toplam+=sayı;
                sayac++;

            } else if (sayı < 0) {
                System.out.println("negatıf sayı");

            }


        } while (sayı!=0);
        System.out.println(sayac + toplam);

    }}