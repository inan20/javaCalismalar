package day0001PractesWhile;

import java.util.Scanner;

public class C011_SonHarfSil {

    public static void main(String[] args) {
      /*  11----
        Kullanıcıdan alınan Stringin son karakteirini silep ekrana yazan Java kodunu yazınız.
        Test Data:
        good
        Beklenen Çıktı:
        goo   */

        String kelime="good";

        kelime=kelime.substring(0,kelime.length()-1);
        System.out.println(kelime);
    }}
