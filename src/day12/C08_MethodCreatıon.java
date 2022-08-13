   package day12;

   import java.util.Scanner;

   public class C08_MethodCreatıon {


       public static void main(String[] args) {//tarih ve sehır ismi isteyi sehir büyük harf tarih//
                                             //  22-06-15 seklinde olacak//

           String sehir = sehirAL();



       }



       private static String sehirAL() {
           Scanner scan = new Scanner(System.in);
           System.out.println("lütfen sehir giriniz");
           String sehir = scan.nextLine().toUpperCase();
            return sehir;


       }


      }
