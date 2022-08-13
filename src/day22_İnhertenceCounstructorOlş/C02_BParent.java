package day22_İnhertenceCounstructorOlş;

public class C02_BParent {
    public class BParent extends C01_AGrandParent {
        protected String isim = "Parent isim belirtilmedi";
        protected String parentKlupAdi = "Parent Klubu";

        BParent() {
            System.out.println("Parent constructor calisti");
        }
    }
}
