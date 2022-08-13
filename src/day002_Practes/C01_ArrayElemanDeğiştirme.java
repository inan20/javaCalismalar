package day002_Practes;

import java.util.Arrays;
import java.util.Random;

public class C01_ArrayElemanDeğiştirme {
    public static void main(String[] args) {
        int []arr={5,8,31,13};
         elemanDeğiştir(arr);




    }

    private static void elemanDeğiştir(int[] arr) {


        Random rnd = new Random();
        arr[1] = rnd.nextInt(100);
        arr[3] = rnd.nextInt(100);
        System.out.println(Arrays.toString(arr));

    }
}
