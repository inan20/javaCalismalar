package day01_Practes;

public class C013 {


    public static void main(String[] args) {
        String gun="pazar";

        switch (gun){
        case "pazartesi":
        case"salı":
        System.out.println("java dersi");
        break;
        case "carsamba":
            System.out.println("selenium");
            break;
            case "persembe":
            case "cuma":
                System.out.println("Sql");
                break;
            default:
                System.out.println("izin günü");

    }





}}
