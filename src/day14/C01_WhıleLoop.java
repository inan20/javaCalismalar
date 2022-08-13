package day14;

import java.util.Scanner;

public class C01_WhıleLoop {
    public static void main(String[] args) {
       /* kullanicidan toplanmak uzere sayilar alin
        sayilarin toplami 500'u gecince (500 dahil)
        sayilarin toplamini ve kac sayi toplandigini su sekilde yazdirin
*/
        int sayı=0;
        int toplam=0;
       int  sayac=0;
        Scanner scan=new Scanner(System.in);
        while (toplam<500) {
            System.out.println("lütfen sayı giriniz");
            sayı=scan.nextInt();
            toplam += sayı;
            sayac++;
            System.out.println(sayac + "sayı girdiniz" + "sayılar toplamı:" + toplam);

        }













    }
}
