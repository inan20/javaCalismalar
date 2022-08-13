package day0001PractesWhile;

import java.util.Scanner;

public class C04_SesliHarf4 {

    /*  6- Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf
    sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın.
     Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin.
             (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen harf giriniz");
        String sesliharf = scan.next();
        String sesliHarflist = "a,e,i,o,u";
        Character harf = sesliharf.charAt(0);
        if (harf >= 'a' && harf <= 'z') {
            if (sesliHarflist.contains(sesliharf)) {
                System.out.println("girdiğiniz karakter sesli harfdir");
            } else if (!sesliHarflist.contains(sesliharf)) {
                System.out.println("girdiğiniz karakter sesli harf degildir");
            }

        } else {
            System.out.println("harf degil");
        }

    }
}


