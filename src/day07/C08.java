package day07;

import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lüfen ay giriniz");
         String ay=scan.nextLine().toLowerCase();
        if (ay.equals("aralık")||
          (ay.equals("ocak"))){
         System.out.println("kış");}
     if (ay.equals("şubat")){
            System.out.println("kış");}
    if (ay.equals("mart"))
        System.out.println("kış");
    if (ay.equals("nisan")||
         (ay.equals("mayıs")||(ay.equals("haziran"))))
        {
        System.out.println("ilkbahar");}
        if (ay.equals("temmuz")|| ay.equals("agustos")){
            System.out.println("yaz");}
        if (ay.equals("eylül")|| (ay.equals("elim")|| (ay.equals("kasım")))){
            System.out.println("sonbahar");}










    }

  }
