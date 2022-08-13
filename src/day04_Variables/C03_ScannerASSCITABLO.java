package day04_Variables;

public class C03_ScannerASSCITABLO {

    public static void main(String[] args) {
        int sayı= 10;
        char harf = 'a';
        String ilkharf  ="a";
        System.out.println(sayı+harf); // char ile sayı toplama a=97+10=107//
        System.out.println(sayı+harf+ilkharf);// 107a char strıng ile işlem sözelleşiyor //
        System.out.println(sayı+harf+"ilkharf"); // 107ilkharf  //
        System.out.println((sayı+harf)+ilkharf+harf);/*parantez icinde olursa char matemetiksel işlem yapıyor sonra
        parantezden sonra strıng ile char sözel oluyor*/
        System.out.println(""+sayı+harf); /*10a  sayıları sözellestirmek için basa " " string isareti koyarsanız sayılar işlem
         yapmnadan aynen yazılır*/
        char harf2 ='1'; //char sayısalda  tek olabılır sözel karakterde olabilir//

}






    }
