package day09;

public class C02_SwitshCase {

    public static void main(String[] args) {



        String input="pazarı";
        input=input.toLowerCase();
        switch (input){
            case "pazartesi":
            case "salı":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("hafta içi");
                break;
            case "cumaertesi":
            case "pazar":
                System.out.println("hafta sonu");
            default:
                System.out.println("lütfen gecerli gün giriniz");









    }






}}
