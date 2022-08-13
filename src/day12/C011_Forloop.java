package day12;

public class C011_Forloop {

    public static void main(String[] args) {
         // forloop 1den 5 e kadar olan tam sayıların toplamını yazdırın//
        int toplam=0;

         for (int i = 1; i <= 5; i++) {
            toplam+=i; //15
        }

         toplam=0;
        for (int i = 10; i <= 30; i++) {
            toplam+=i;
        }
        System.out.println(toplam);//420

        toplam=0;
        // 30 ile 60 arası çift sayıların toplamını yazdırın//
        for (int i = 30; i < 60; i++) {
            if(i%2==0);
            toplam+=i;
      // sout u forloop } içine koyarsan her aşamayı yazdırır//
        }
        System.out.println(toplam);

      toplam=0;
      //1300  dahil ile 1500 dahiıl arası 7 ye bölünenlerin toplamını  yazdırın//
        for (int i = 1300; i <=1500 ; i++) {
            if (i%7==0);
            toplam+=i;

        }
        System.out.println(toplam);//281400//

    }

























}
