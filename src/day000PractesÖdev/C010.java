package day000PractesÖdev;

import java.util.Scanner;

public class C010 {

    public static void main(String[] args) {
        /* Kullanicidan 3 tene pozitif tam sayi alniz. bu uc sayinin ucgen olusturma
         * durumunu kontrol ediniz eger ucgen olabiliyor ise, es kenar ucgen olma
         * durumunu da kontrol edniz
         *
         * üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük,
         * herhangi iki kenar farkı diger kenardan büyük olmali a+b>c>a-b a+c>b>a-c

         * b+c>a>b-c a=b=c ise es kenar ucgen*/
        Scanner scan = new Scanner(System.in);

        System.out.println("a giriniz");
        int a = scan.nextInt();
        System.out.println("b");
        int b = scan.nextInt();
        System.out.println("c");
        int c = scan.nextInt();
        if (a == b) {
            System.out.println("eskenar uçgen");


        }


    }}
