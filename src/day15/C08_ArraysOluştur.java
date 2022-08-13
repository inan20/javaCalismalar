package day15;

import javax.lang.model.element.Element;
import java.util.Arrays;
import java.util.Scanner;

public class C08_ArraysOluştur {
    public static void main(String[] args) {

        int[] sayılar=arrayOluştur();
        System.out.println(Arrays.toString(sayılar));

    }

    public static int[] arrayOluştur() {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen array uzunluğu giriniz");
        int uzunluk = scan.nextInt();
        int oluşturulan[]= new int[uzunluk];
        for (int i = 0; i <uzunluk;i++) {
            System.out.println(i+" array elementi giriniz");
            oluşturulan[i] =scan.nextInt();


        }
           return oluşturulan;
    }

}








