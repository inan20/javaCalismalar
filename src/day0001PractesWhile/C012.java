package day0001PractesWhile;

import java.util.Scanner;

public class C012 {

    public static void main(String[] args) {

      /*  10-----Kullanıcıdan alınan String kümesi içerisinde aranan  String i bulan Java Kodunu yazınız.
        Test Data:
        Java is easy

        Aranan String: is
        Bektenen Çıktı:
        True

        Aranan String: and
        Beklenen Çıktı:False
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kelime  giriniz");
        String kelime=scan.next();
        String cümle="java kullanmak emek ister";
        System.out.println(cümle.contains(kelime));


        }











    }




