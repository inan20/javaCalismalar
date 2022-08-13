package day04_Variables;

public class C09_AutoWidening {

    public static void main(String[] args) {
        byte sayı1=23;
        short sayi2=55;
        int sayı3=sayı1*sayi2;
        //System.out.println(sayı4);// 1265.0  doble otomatik byte ve shortu içine aldı//
        //double sayı4=sayı1/sayi2; // sonuç 2,3 olması lazımken java ilk saga işlem yapar onlar double olmadiği
        // için 2,3 2 olarak atar//
        double sayı4=(double) sayı1/sayi2;
        System.out.println(sayı4);



    }






   }
