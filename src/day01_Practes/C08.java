package day01_Practes;

import java.util.Scanner;

public class C08 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int not=85;
        if (not>90&& not<100){
            System.out.println("A");
            if (not<90&&not>80)
            System.out.println("B");
           if (not<80 && not>70)
            System.out.println("C");
            if (not<70&& not>60)
            System.out.println("D");
            else {System.out.println("gecersiz not");}


        }



    }







}
