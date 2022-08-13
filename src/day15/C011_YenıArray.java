package day15;

import java.util.Arrays;
import java.util.Scanner;

public class C011_YenıArray {
    public static void main(String[] args) {


        int sayı[] = YeniArray();
        System.out.println(Arrays.toString(sayı));
    }


    private static int[] YeniArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen uzunluk giriniz");
        int uzunluk = scan.nextInt();
        int Yenioluştur[] = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println(i + "lütfen element giriniz");
            Yenioluştur[i] = scan.nextInt();
        }

        return Yenioluştur;
    }
}