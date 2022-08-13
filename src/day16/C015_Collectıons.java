package day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C015_Collectıons {
    public static void main(String[] args) {


        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");



        Collections.sort(urunler);
        System.out.println(urunler);//[Cay, Cekirdek, Ikram, Nutella]// sıralama alfabetık


    }
}
