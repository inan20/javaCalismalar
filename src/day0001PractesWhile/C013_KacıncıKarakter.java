package day0001PractesWhile;

import java.util.ArrayList;
import java.util.List;

public class C013_KacıncıKarakter {
    public static void main(String[] args) {
       /* 17---
                Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.
        Test data:
        12,24,34
        Beklenen Çıktı:*/
        int[] sayı={12,24,34};
        int enküçük=sayı[0];
        for (int i = 0; i<sayı.length; i++) {
           if (sayı[i]<enküçük){
               enküçük=sayı[i];
           }

        }
        System.out.println(enküçük);
        }
    }

