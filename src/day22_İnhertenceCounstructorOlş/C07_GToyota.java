package day22_İnhertenceCounstructorOlş;


    public class C07_GToyota {
        C07_GToyota() {
            System.out.println("GToyota parametresiz cons");
        }

        C07_GToyota(String isim) {
            // super(isim);  extends olmadigi icin super constructor call'u java kabul etmez
            System.out.println("GToyota parametreli cons");
        }

    }
