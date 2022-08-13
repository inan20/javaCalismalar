package day10;

public class C03_ {
    public static void main(String[] args) {

        String isim="Ahmet";
        String soyisim="Inan";
        String sıfre="1234567891";
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        System.out.println(isim);
        soyisim=soyisim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        System.out.println(soyisim);
         sıfre=sıfre.substring(0,4)+sıfre.substring(4).replaceAll("\\d","*");
        System.out.println(sıfre);







    }









}
