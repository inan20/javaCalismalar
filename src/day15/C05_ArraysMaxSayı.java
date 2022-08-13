package day15;

import java.util.Arrays;

public class C05_ArraysMaxSayı {

    public static void main(String[] args) {
        // arryde sayıların en büyüğünü yazdırınız////////////
        int sayılar[] = {3, 5, 2, 7, 9, 10};

        maxSayıYazdır(sayılar);


    }

    private static void maxSayıYazdır(int[] sayılar) {
        int maxSayı = sayılar[0];

        for (int i = 0; i < sayılar.length; i++) {
            if (sayılar[i] > maxSayı) {
                maxSayı = sayılar[i];
            }

        }
        System.out.println(maxSayı);

    }
}