package day12;

public class C04_MethodCreation {

    public static void main(String[] args) {
     String isim="Ahmet";
     String soyısım="Inan";
// İsim ve soyismi gizleme methodu//
// ilk harf büyük diğer harfla ** olacak bir method yap//
      ismiYıldızla (isim,soyısım);

    }

    private static void ismiYıldızla(String isim, String soyısım) {
       isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
       soyısım=soyısım.substring(0,1).toUpperCase()+soyısım.substring(1).replaceAll("\\w","*");
        System.out.println(isim+"  "+soyısım);





    }


}
