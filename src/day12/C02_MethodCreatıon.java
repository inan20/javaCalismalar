package day12;

public class C02_MethodCreatıon {


    public static void main(String[] args) {

        tersineYazdır("Ahmet");



    }
// 5 harfli bir kelimeyi ters yazdıran method//
    public static void tersineYazdır(String input){

        String tersİnput=input.substring(4)+
                input.substring(3,4)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);

        System.out.println("tersineyazdır:"+ tersİnput);




  }






















}
