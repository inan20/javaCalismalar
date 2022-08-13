package day10;

import java.util.Scanner;

public class C06_Contains {

    public static void main(String[] args) {


       //kullanicıdan email adresi isteyin @mail içermiyorsa
        //kütfen email giriniz
        // @mail ie bityiyorsa email kaydedin//
        //@mail ie bitmiyorsa email adresi girin//
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfrn email adresini giriniz");
        String email=scan.nextLine();
        if (!email.contains("@mail"))
        {
            System.out.println("lütfen email giriniz");}
         else if(email.lastIndexOf("@mail")==(email.length()-5))

        {System.out.println("email kaydedin");}
            else {
                System.out.println("email adresi girin");
        }












    }







}
