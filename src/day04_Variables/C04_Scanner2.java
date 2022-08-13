package day04_Variables;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class C04_Scanner2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("kullaniciIsmi giriniz");
        String kullaniciIsmi= scan.next();
        System.out.println("isimniz:" + kullaniciIsmi);
    }

}