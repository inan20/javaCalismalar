package day22_İnhertenceCounstructorOlş;

public class C05_EMuhasebe {
    public class EMuhasebe extends C04_DPersonel {
        EMuhasebe() {
            System.out.println("Muhasebe parametresiz cons");
        }

        EMuhasebe(String isim) {
            System.out.println("Muhasebe parametreli cons");
        }


    }
}