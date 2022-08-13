package day04_Variables;

import java.util.Scanner;

public class C06_Scanner4 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen adinizi giriniz");
        String adiniz =scan.next();
        System.out.println("lutfen soyadinizi giriniz");
        String soyadiniz =scan.next();
        System.out.println("lutfen yasinizi girinz");
              double yasiniz=scan.nextDouble();
        System.out.println("adiniz"+"soyadiniz"+ "yasiniz:" +adiniz+soyadiniz+ yasiniz);
    }








}
