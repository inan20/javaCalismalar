package day15;

import java.util.Arrays;

public class C012_ArrayelementArttır {
    public static void main(String[] args) {
        /*array listesine yeni eleman eklemw*/

        String sınıfListesi[]={"ahmet","mehmet","süleyman"};
        String eklenecekListe="ali";
          sınıfListesi=yeniListe(sınıfListesi,eklenecekListe);
        System.out.println(Arrays.toString(sınıfListesi));
    }

    private static String []yeniListe(String[] sınıfListesi, String eklenecekListe ) {
        String[] yeniListe=new String[sınıfListesi.length+1];
        for (int i = 0; i <sınıfListesi.length ; i++) {
            yeniListe[i]=sınıfListesi[i];
        }
        yeniListe[yeniListe.length-1]=eklenecekListe;
        return yeniListe;
    }

}
