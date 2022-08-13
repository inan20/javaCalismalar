package day16;

import java.util.Arrays;

public class C02_MultıDımensıonel2 {

    public static void main(String[] args) {

        //MultıDımensıonel elwmentlerını yazdıran Method oluşturma//
        int[][] sayılar = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9}};
        elementYazdır(sayılar);


    }

    private static void elementYazdır(int[][] sayılar) {
        for (int i = 0; i < sayılar.length; i++) { //i=aut arry indexi 0,1,2 //j=iniry indexi123456789
            for (int j = 0; j < sayılar[i].length; j++) {
                { System.out.print(sayılar[i][j]+" ");
            }
        }


    }}}