package day25_Exceptıon;

import java.util.Scanner;

public class C05_Throws {
    public static void main(String[] args) throws ClassNoFoundException {
        /* throws var ise kullanıcının gireceği değerden dolayı excaptıon oluşabilir demek*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen kan vermek için yaş giriniz");
        int yas = scan.nextInt();

        try {
            mekanKontrol(yas);

        } catch (Exception e) {
            System.out.println("sorun yakalandı");
        }
    }
    public static void mekanKontrol(int yas) {


        if (yas < 18)
            throw new RuntimeException();
        else {
            System.out.println("kan vermek için yasınız uygun");

        }
    }

    private static class ClassNoFoundException extends Exception {
    }
}


