package day01_Practes;


import java.util.Scanner;

public class C10 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen meslek giriniz");
        String meslek=scan.nextLine();
            switch(meslek) {
                case "QA":
                    System.out.println("tester");
                    break;
                case "DEV":
                    System.out.println("Developer");
                    break;
                case "ba":
                    System.out.println("busunıs Analys");
                    break;
                case "pm":
                    System.out.println("prodac manacer");
            }


        }


    }








