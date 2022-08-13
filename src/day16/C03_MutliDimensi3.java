package day16;

public class C03_MutliDimensi3 {
    public static void main(String[] args) {
        /* verilen iki katlı muultidımens arryde outer indexi ile inır indexi aynı olan elemanları
        toplamını bulunuz*/

        int[][] sayılar = {{1, 2, 2}, {4, 4, 6, 7}, {8, 8, 10, 11}};
        int toplam = 0;
        for (int i = 0; i < sayılar.length; i++) {
            for (int j = 0; j < sayılar[i].length; j++) {
                if (i == j) {
                    toplam += sayılar[i][j];


                }

            }
            System.out.println(toplam);}



        }}