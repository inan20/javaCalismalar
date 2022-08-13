package day000PractesÖdev;

import java.util.Scanner;

public class C011 {
    public static void main(String[] args) {
       /*  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
                *
                BMI = kilo(kg) /(boy*boy)(cm)
                BMI <=20 oldukca zayifsiniz
        20<BMI<=25 Normal sinirlardasiniz
        25<BMI<=30 Sisman kategorisindesiniz
        30<BMI ==> Obez grubunda*/
        Scanner scan=new Scanner(System.in);
        System.out.println("kilo ve boy gırınız");
        double kilo=scan.nextDouble();
        double boy=scan.nextDouble();
        double BMI=(kilo)/(boy*boy);
        if (BMI <=20){
            System.out.println("oldukca zayifsiniz");}
         else if
        (20<BMI||BMI<=25) {
            System.out.println("Normal sinirlardasiniz");}
         else if ( 25<BMI||BMI<=30) {
             System.out.println("Sisman kategorisindesiniz");}

             else if (30<BMI||BMI>30){
             System.out.println("Obez grubunda");

    }

}}
