package day07;

import java.util.Scanner;

public class C06_IfStamentes {


        public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen Not Giriniz");
        int Not=scan.nextInt();
     if ( Not<0 || Not>100){
         System.out.println("gecerli not giriniz");}
     else if (Not<50){
         System.out.println("Not D");}
      else if (Not>=50 & Not<=60) {
             System.out.println(" Not C " );}
      else if (Not>60 & Not<80){
             System.out.println("Not B");}
      else {
             System.out.println("Not A ");}




















    }




}
