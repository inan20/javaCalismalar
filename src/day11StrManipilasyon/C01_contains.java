package day11StrManipilasyon;

import java.util.Scanner;

public class C01_contains {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle girin");
        String cümle=scan.nextLine();
        if (cümle.contains("buyuk"))
        { System.out.println(cümle.toUpperCase());}
        else if (cümle.contains("kucuk")) {
            System.out.println(cümle.toLowerCase());}
            else{
                System.out.println("cümle buyuk veya kucuk kelimeleri içermiyor");

        }
    }








}
