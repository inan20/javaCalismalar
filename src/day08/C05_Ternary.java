package day08;

import java.util.Scanner;

public class C05_Ternary {
/* kullanıcıdan bir sayi isteyin pzitfse yazdırın  negatifse birsayı \n
 daha isteyin ikisinin carpımımnı  yazdırın
 */
        public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);
            System.out.println("lütfen bir sayı giriniz");
            double sayi=scan.nextDouble();
            if (sayi>0){
                System.out.println("sayi pozitif");}
            else if (sayi<0)  ; {
                System.out.println("lütfen bir sayi isteyin");}
             double sayi2=scan.nextDouble();
            if (sayi<0){
                System.out.println(sayi*sayi2);




            }


        }


}