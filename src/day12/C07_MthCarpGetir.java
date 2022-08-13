package day12;

public class C07_MthCarpGetir {

  //verılen sayıyı carpan method olusturma//
    public static void main(String[] args) {


        int sayi1 = 10;
        int sayi2 = 20;
        int sonuc = carpGetır(sayi1,sayi2);
        System.out.println(sonuc);

    }

    public static int carpGetır(int sayı1, int sayı2) {
  int sonuc=sayı1*sayı2;
  return sonuc;


    }
}