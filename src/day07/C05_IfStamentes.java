package day07;

import java.util.Scanner;

public class C05_IfStamentes {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sayi Giriniz");
        int yas=scan.nextInt();
          if (yas>0) {
              System.out.println("Lutfen gecerli sayi giriniz");}
          else if (yas<65){
                System.out.println("Emekli olamaz"+(65-yas)+"yil calismalisin");
        }
          else {
                System.out.println("Emekli Olur");

// birden fazla if else if birbirine bağlanmişsa son durum önemlidir eger else ile bitiyorsa tüm durumları kapsıyordur
              // ama else if ie bitiyorsa tum durumları kapsamıyordur//

            }








    }




}
