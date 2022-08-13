package day000PractesÖdev;

public class C06 {
    public static void main(String[] args) {
       /* Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki
       basamagindaki rakamlari toplamini bulunuz*/

        int sayı=12345;
        int birlerBasamagı=0;
        int onlarBasamağı=0;
        int yuzlerBasamağı=0;
        int sayılarToplamı=0;
        int binlerBasamagı=0;
        int onbinlerBasamsğı=0;
        int input=sayı;

        birlerBasamagı=sayı%10;
        onlarBasamağı=(sayı/10)%10;
        yuzlerBasamağı=(sayı/100)%10;
        binlerBasamagı=(sayı/1000)%10;
        onbinlerBasamsğı=(sayı/10000)%10;
        System.out.println("ilk iki basamağın toplamı:"+ birlerBasamagı+onbinlerBasamsğı);
        System.out.println("son iki basamağın toplamı:"+onbinlerBasamsğı+binlerBasamagı);





    }

}
