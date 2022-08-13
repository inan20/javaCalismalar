package day01_Practes;

public class C16_MethodCreation {
    public static void main(String[] args) {

        //üç basamaklı sayı toplamı yazdıran bir METHOD Yapın//

        int input = 455;
      int rakamtoplama =rakamlarToplamı(input);
        System.out.println(input);
        System.out.println(rakamlarToplamı(input));
    }

    public static int rakamlarToplamı(int input) {
        int rakamlarToplamı =0;
        int birlerBasamağı=0;
        int ılksayı=input;

        birlerBasamağı = input % 10;
        rakamlarToplamı += birlerBasamağı;
        input /= 10;

        birlerBasamağı = input % 10;
        rakamlarToplamı += birlerBasamağı;
        input /= 10;

        birlerBasamağı = input % 10;
        rakamlarToplamı += birlerBasamağı;
        input /= 10;
        return rakamlarToplamı;
    }}




