package day0001PractesWhile;

public class C08_İsmiYıldızla {
    public static void main(String[] args) {

       String isim="Ahmet";
        String soyısım="Inan";

       isim= isim.substring(0,1)+isim.replaceAll("\\w","*");
        System.out.println(isim);
        soyısım=soyısım.substring(0,1)+soyısım.replaceAll("\\w","*");
        System.out.println(soyısım);

    }
}
