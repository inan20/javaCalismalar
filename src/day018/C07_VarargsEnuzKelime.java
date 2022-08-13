package day018;

public class C07_VarargsEnuzKelime {
    public static void main(String[] args) {
        String[] kelime = {"Havva", "Ahmet", "YunusEmre", "Fatih", "Neva"};

        enUzunKelime(kelime);


    }

    //if (isimler[i].length()>enUzunKelime.length()){enUzunKelime=isimler[i];}//
    private static void enUzunKelime(String...Kelime) {

        String enUzunKelime = Kelime[0];
        for (int i=0; i <Kelime.length; i++) {
            if (Kelime[i].length()>enUzunKelime.length()){

            enUzunKelime=Kelime[i];}
        }
        System.out.println(enUzunKelime);
    }

}