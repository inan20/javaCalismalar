package day22_İnhertenceCounstructorOlş;

public class C08_HCorolla extends C07_GToyota {

    public C08_HCorolla(String isim) {
    }

    public C08_HCorolla() {
    }

    public class HCorolla extends C07_GToyota {
        HCorolla() {
            System.out.println("HCorolla parametresiz cons");
        }

        HCorolla(String isim) {
            super(isim);
            System.out.println("HCorolla parametreli cons");
        }

    }
}
