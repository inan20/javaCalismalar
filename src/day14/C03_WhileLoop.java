package day14;

public class C03_WhileLoop {
    public static void main(String[] args) {


         // 9 ile 190 arası 7 nin katlarını yazdırın//
        int bas=9;
        int bitis=190;
         int sayı=bas;
         int sonuc=0;
        do {
             if (sayı%7==0)
               {
                 System.out.println(sayı);
             }   sayı++;
         }while (sayı<=bitis);





       for (int i = 9; i <190 ; i++) {
            if (i%7==0){
              sonuc=(i);

                System.out.println(sonuc);
            }



        }
















    }
}
