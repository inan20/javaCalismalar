package day00_Practes;

import java.util.Scanner;

public class C01 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen fiyat giriniz");
        int fiyat=scan.nextInt();
        System.out.println(fiyat<10?"ucuz" :fiyat<=20?"normal":"pahalı");//ternery method//
    }













}
