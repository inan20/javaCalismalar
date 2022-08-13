package day25_Exceptıon;

public class C12_İciceExceptıon {
    public static void main(String[] args) {


        String str = "123a45";
        int sayi=0;
        try {
             sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("lütfen sayı giriniz");} catch(Exception e) {
            System.out.println("code belirlenemeyen hata ");
        }
        System.out.println("Sayinin karesi : " + sayi*sayi);
        /* code çalışmaya devam eder*/
    }
} /*
          Kullanicidan String olarak bir deger aliyor
          ve bunu integer'a ceviriyorsak
          NumberFormatException ile karsilasabilecegimizi ongoruruz
          NFE aldigimizda kodun durmamasini istiyorsak
          try catch ile cevreleyebiliriz
          Eger bilmedigim bir exception daha olusursa
          kodum durmasin istiyorsak
          bir kere daha catch cumlesi ekleyip ona en genis Exception'i yazabiliriz.
         */