package day09;

import java.util.Scanner;

public class C07_SwitshCase {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun numarası giriniz");
        int günNo=scan.nextInt();

        switch (günNo) {
        case 1:
            System.out.println("pazartesi");
            break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Perembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumaertesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("lütfen gecerli gunNo giriniz");


    }

}}

