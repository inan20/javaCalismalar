package day000PractesÖdev;

import java.util.Scanner;

public class C013_İfElse {
    public static void main(String[] args) {


		 /* Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada
		 * hatali giris seklinde kod yazniz*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen harf giriniz");
        char harf=scan.next().charAt(0);
        if(harf>='A'&& harf<='Z')
        {System.out.println("büyük harf");}
        else if (harf>='a'&& harf<='z'){
            System.out.println("kücük harf");}
        else {
            System.out.println("hatalı giriş");
}}}
