package day0001PractesWhile;

public class C02_üçgenYazdırma {
    public static void main(String[] args) {

       int sayı=0;

        for (int i = 0; i <=6; i++) {
            for (int j =0; j <=i ; j++) {
                System.out.print(i);

            }
            System.out.println(i);
        }
          int sayı1=1;
        for (int i = 6; i > 0; i--) {
            for (int j =i; j >0 ; j--) {
                System.out.print(i);
            }
            System.out.println(i);
        }
    }
}
