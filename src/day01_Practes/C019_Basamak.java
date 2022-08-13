package day01_Practes;

import java.util.Scanner;

public class C019_Basamak {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayı = scan.nextInt();
          basamakToplamı(sayı);
        System.out.println(basamakToplamı(sayı));
    }

    private static int basamakToplamı(int sayı) {
        int toplam = 0;
        while (sayı!=0) ;
        {
            toplam += sayı%10;
            sayı /=10;
        }
        return toplam;
    }
}