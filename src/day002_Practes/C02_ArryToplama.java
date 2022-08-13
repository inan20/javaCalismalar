package day002_Practes;

import java.util.Arrays;

public class C02_ArryToplama {
    public static void main(String[] args) {
       /* 21----
        Array deki sayıları tolpayan Java kodunu yazınız.
​
        array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
​
        Beklenen Çıktı:
        Array toplamı: 55*/

       int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
          int toplam=arr[0];

        for (int i =0; i <=arr.length-1; i++) {


           toplam+=arr[i+1];
            System.out.println(toplam);
        }







    }
}
