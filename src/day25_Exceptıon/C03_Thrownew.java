package day25_Exceptıon;

import java.util.Scanner;

public class C03_Thrownew {
    public static void main(String[] args) {
        /* method olusturarak throw ile exception fırlatma*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kan vermek için yaş giriniz");
        int yas=scan.nextInt();
        kanVer(yas);

    }

    private static void kanVer(int yas) {

        if (yas < 18)
            throw new RuntimeException();
        else {
            System.out.println("kan vermek için yasınız uygun");

        }
    }
}
