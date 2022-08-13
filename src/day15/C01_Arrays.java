package day15;

import java.sql.Array;
import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
         int myArray[]=new int[3];//length yazılmazsa default yanı java kendı deger atar//
         myArray[0]=9;
         myArray[1]=10;
         myArray[2]=10;
          String sınıfList[]={"Ayse","Fatma","Hasan"};
        System.out.println(Arrays.toString(sınıfList));// Ayse,Fatma,Hasan
        System.out.println(sınıfList[0]);//Ayse

    }

}
