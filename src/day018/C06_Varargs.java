package day018;

public class C06_Varargs {
    public static void main(String[] args) {

        int sayı1=10;
        int sayı2=20;
        int sayı3=30;
        int sayı4=40;
        int sayı5=50;
        toplaYazdır(sayı1,sayı2,sayı3,sayı4,sayı5);

    }

    public static void toplaYazdır(int... sayı) {
        int toplam = 0;
        for (int i : sayı)
            toplam += i;
        {
            System.out.println("girilen adet sayinin toplamı:" + toplam);
        }
    }
    }

    //girilen adet sayinin toplam�:150//
