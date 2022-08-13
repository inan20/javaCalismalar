package day15;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int sayılar[]={1,2,3};
        String harfler[]=new String[4];
        System.out.println(sayılar.length);//3 toplam elementı verır
        System.out.println(harfler.length);// 4 toplam elementı yazdırır
        System.out.println(Arrays.toString(sayılar));// 1,2,3
        System.out.println(Arrays.toString(harfler));// null,null,null,null
        System.out.println(harfler[harfler.length]);// error


    }

}
