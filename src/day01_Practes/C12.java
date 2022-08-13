package day01_Practes;

import java.util.Scanner;

public class C12 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen Vize1 notu giriniz");
        Double vize1=scan.nextDouble();
        System.out.println("lütfen vize2 notu giriniz");
        Double vize2=scan.nextDouble();
        System.out.println("lütfen Final notunuzu giriniz");
        Double final1=scan.nextDouble();
        Double sonuc=(vize1+vize2)/2*(0.3)+(final1)*(0.7);
        System.out.println("yıl sonu notunuz"+"  "+sonuc);





    }





}
