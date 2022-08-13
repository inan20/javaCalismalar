package day16;

import java.util.Arrays;

public class C04_MultıDımensiToplama {
    /*
      Soru 4) Asagidaki multi dimensional array’in
      ic array’lerindeki tum elemanlarin toplamini birer birer bulan
      ve herbir sonucu yeni bir array’in elemani yapan
      ve yeni array’i ekrana    yazdiran bir program yaziniz
  Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
       */
    public static void main(String[] args) {

        int[][] sayılar = {{1, 2, 2}, {4, 4, 6, 7}, {8, 8, 10, 11}};
        int[]yenıArr=new int[sayılar.length];
        int toplam=0;
        for (int i = 0; i < sayılar.length; i++) {
            for (int j = 0; j <sayılar[i].length ; j++) {
                toplam+=sayılar[i][j];
            }
            yenıArr[i]=toplam;
            toplam=0;
        }

        System.out.println(Arrays.toString(yenıArr));
    }

}
