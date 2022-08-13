package day00_Practes;

import java.util.Scanner;

public class C05_swithc {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("lütfen S, D, E,T harflerinden birini giriniz" );
     Character harf=scan.nextLine().toUpperCase().charAt(0);
     switch (harf){
         case 'S':
             System.out.println("Software");
             break;
         case 'D':
             System.out.println("Developer");
             break;
         case 'E':
             System.out.println("Engineer");
             break;
         case 'T':
             System.out.println("İn Testing");
         default:
             System.out.println(" lütfen gecerli karaktr giriniz");



     }


    }
}