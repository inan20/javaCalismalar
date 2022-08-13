package day16;

import java.util.ArrayList;
import java.util.List;

public class C011_ListÜrünDegiştirme {
    public static void main(String[] args) {

        List<String> ürünlerListesi=new ArrayList<>();
        ürünlerListesi.add("hanımeller");
        ürünlerListesi.add("biskrem");
        ürünlerListesi.add("albeni");

        List<String> eskiürünlerListesi=new ArrayList<>(); // bu kod bir şablon//

        String silinecekÜrün="albeni";
        String eklenecekÜrün="çokokrem";

        int temp= ürünlerListesi.indexOf(silinecekÜrün);//albeni//
         String degişenÜrün=ürünlerListesi.set(temp,eklenecekÜrün);
        System.out.println("ürünlerListesi:"+ürünlerListesi);//[han�meller, biskrem, �okokrem]//
         eskiürünlerListesi.add(silinecekÜrün);
        System.out.println("eskiürünlerListesi:"+eskiürünlerListesi);//eski�r�nlerListesi:[albeni]//







    }
}
