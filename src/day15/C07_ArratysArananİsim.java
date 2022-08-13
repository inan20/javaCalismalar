package day15;

import java.util.Arrays;
import java.util.Scanner;

public class C07_ArratysArananİsim {
    public static void main(String[] args) {

        String isimler[] = {"Ahmet", "Mehmet", "Ali", "Yasin"};
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen aradığığınız ismi giriniz");
        String isim = scan.nextLine();
        boolean sonuc = arananİsimMethod(isimler, isim);

        System.out.println(sonuc);
    }

    private static boolean arananİsimMethod(String[] isimler, String isim) {
        boolean arananSonuc = false;
        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].equalsIgnoreCase(isim)) {
                arananSonuc = true;
            }

        }
        return arananSonuc;


    }}

