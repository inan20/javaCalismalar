package day0001PractesWhile;

import java.util.Scanner;

public class C16_KacıncıSayıHarf {
    /* Grilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız
     Test Data:
     Java is fun

     Beklenen Çıktı
     0. pozisyondaki karakter : J

         5. pozisyondaki karakter : i*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen sayı giriniz");
        int sayı=scan.nextInt();
        String cümle = "java";
        switch (sayı) {
            case 1:
                System.out.println("1,pozisyondaki harf" + 'j');
                break;
            case 2:
                System.out.println("2.pozisyondaki harf" + "a");
                break;
            case 3:
                System.out.println("3.pozisyondaki harf" + "v");
                break;
            case 4:
                System.out.println("4.pozisyondaki harf" + "a");
                break;
            default:
                System.out.println("geçerli sayı giriniz");
        }

    }
}