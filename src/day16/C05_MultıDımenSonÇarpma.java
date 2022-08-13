package day16;

import java.util.Arrays;

public class C05_MultıDımenSonÇarpma {

    public static void main(String[] args) {
          /*
        Soru 2) Asagidaki multi dimensional array’in
        ic array’lerindeki son elemanlarin carpimini
        ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }
         */

        int[][] sayılar = {{1, 2, 2}, {4, 4, 6, 7}, {8, 8, 10, 11}};
         int[]sayıcarpım=new int[3];

        int carpım=1;
        for (int i = 0; i < sayılar.length ; i++) {
            for (int j = 0; j <sayılar[i].length ; j++) {
                if (j==sayılar[i].length-1)
                carpım*=sayılar[i][j];
               sayıcarpım[i]=carpım;

            }
        }
        System.out.println(Arrays.toString(sayıcarpım));


    }
}
