package day12;

public class C05_MethodCreationRETURN {



      public static void main(String[] args) {
        String isim="Ahmet";
        String soyısım="Inan";
        String ismiGizle=ismiGizle(isim,soyısım);// ismi gizli stringe sonuca ata methodu kaydetmek için

      //  ismiGizle (isim,soyısım);
          System.out.println(isim+""+soyısım);// isim soyusım orjinal halini yazdırıyor//
          System.out.println(ismiGizle);//ismi gizleyerek yazdırıyor//

    }

    public static String ismiGizle(String isim, String soyısım) {
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyısım=soyısım.substring(0,1).toUpperCase()+soyısım.substring(1).replaceAll("\\w","*");
       // System.out.println(isim+"  "+soyısım);
      return isim+"  "+soyısım;



















    }}
