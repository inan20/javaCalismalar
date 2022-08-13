package day07;

import java.util.Scanner;

   public class C04_IfStamentes {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz" );

        char Harf=scan.next().charAt(0);
         if  ((Harf>='a'&& Harf<='z')||( Harf>='A'&& Harf>='Z')){

        System.out.println("Gırılen Karakter Harftır");
       }  else{
            System.out.println("Girilen karakter Harf değildir");

        }
    }

   }

