package day0_Practes;

public class C01_Forloop {
    public static void main(String[] args) {

        int sayı=0;

        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
             int sayı1=1;
        for (int i = 8; i > 0; i--) {
            for (int j=i; j>0 ; j--) {
                System.out.print("*");
            }
            System.out.println("*");
        }



    }
}
