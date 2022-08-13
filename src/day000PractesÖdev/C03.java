package day000PractesÖdev;

public class C03 {
    public static void main(String[] args) {

        int sayı=12345;
         int birlerBasamağı=0;
         int sayılarToplamı=0;

         while(sayı>0){
             birlerBasamağı=sayı%10;
           sayılarToplamı+=birlerBasamağı;
           sayı/=10;

             System.out.println(sayılarToplamı);

    }

}}
