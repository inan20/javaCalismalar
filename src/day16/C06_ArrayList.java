package day16;

import java.util.ArrayList;
import java.util.List;

public class C06_ArrayList {
    public static void main(String[] args) {
 /*
         List primitive data turlerini kabul etmez
         (Type argument cannot be of primitive type)
         */

        List<String>isimler =new ArrayList<>();
        isimler.add("Ahmet");
        System.out.println(isimler);//[ahmet]//
        isimler.add("Ayse");// [Ayse] // arrye ekler

         List<Integer>sayılar=new ArrayList<Integer>();
        // sadece add() kullanirsak Java sona ekler
         sayılar.add(5);
         sayılar.add(3);
         sayılar.add(7);
        sayılar.add(2,9);// add(index,element) istedigimiz index'e istegimiz elementi yerlestirir
        // add methodu eski elementleri silmez veya update etmez, yeni element ekler
        System.out.println(sayılar);//[5,3,9,7] yazdırır
    }
}
