package day25_Exceptıon;

public class C01_TryCatch_Manuel {
    public static void main(String[] args) {
    /*    int a = 30;
        int b = 0;
        /*  try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz
                  islemleri yazmak icin kullanilir
        catch'den sonraki parantez karsilasmayi bekledigimiz exception
                  turunu Javaya soylemek icin kullanilir
        catch blogu  : Java'ya soyledigimiz exception(isnisnai durum) gerceklesirse
                   Java'nin yapmasini istedigimiz islem
         *

        try {
            int c = a / b;
            System.out.println(c);

        } catch
        (ArithmeticException e) {
            System.out.println("sayı 0 a bölünemz");
        }


  /*Önemli 1 throwab
           2 Exceptıon
           3 Run time Exceptıon
           4 ArıtmetıcExceptıon    */

        int a = 1000;
        int b = 50;
        int sayac = 1;


      /*  try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz
        islemleri yazmak icin kullanilir
        catch'den sonraki parantez karsilasmayi bekledigimiz exception
        turunu Javaya soylemek icin kullanilir
        catch blogu  : Java'ya soyledigimiz exception(isnisnai durum) gerceklesirse
        Java'nin yapmasini istedigimiz islem*/

        while (sayac < 100) {

            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println("sayı 0 olabilır dikkat et");



            }
            b--;
            sayac++;

        }

    }

}











