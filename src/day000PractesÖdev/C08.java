package day000PractesÖdev;

import java.util.Scanner;

public class C08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz*/

       Scanner scan=new Scanner(System.in);
        System.out.println("lütfen vize notu giriniz");
        double vize=scan.nextDouble();
        System.out.println("lütfen 2.vize Notunu giriniz");
        double vize2=scan.nextDouble();
        System.out.println("lütfen final Notunu giriniz");
        double final1=scan.nextDouble();
        double not=(vize+vize2)/2*(0.3)+(final1)*(0.7);
        System.out.println(not);













    }
}
