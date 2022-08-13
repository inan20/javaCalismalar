package day000PractesÖdev;

import java.util.Scanner;

public class C09 {
    public static void main(String[] args) {

        /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz*/

        Scanner scan=new Scanner(System.in);
        System.out.println("a sayisi giriniz");
        double a=scan.nextDouble();
        System.out.println("b sayisi giriniz");
        double b=scan.nextDouble();
        System.out.println("c sayisi giriniz");
        double c=scan.nextDouble();
        double d= (c*3)/(a*a)-(b*b);
        System.out.println(d);




    }

}
