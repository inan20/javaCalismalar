package day00_Practes;

import java.util.Scanner;

public class C13 {


    public static void main(String[] args) {

        /*Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda
        konsola tam ismini buyuk harfler ile yazdirin
        public static void main(String[] args) {
            Scanner scan  = new Scanner(System.in);
            System.out.println("lutfen isminizi ve soy isminizi giriniz :");
            String firstName = scan.nextLine(), lastName = scan.nextLine();  //multiple declaration

            String fullName = firstName.concat(" " + lastName).toUpperCase();
            System.out.println("fullName = " + fullName);
*/

          Scanner scan=new Scanner(System.in);
        System.out.println("isim");
         String isim=scan.nextLine().toUpperCase();
        System.out.println("soyisim");
        String soyısım=scan.nextLine().toUpperCase();
        System.out.println(isim.concat(" "+soyısım));










        }}