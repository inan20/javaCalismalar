package day15;

public class C06_ArraysEnUzunKelime {
    public static void main(String[] args) {
        String isimler[] = {"Ahmet", "Osman", "Muhammed", "mustafa", "Fethullah"};
        enUzunVeKısaKelime(isimler);


    }

    private static void enUzunVeKısaKelime(String[] isimler) {
        String enUzunKelime =isimler[0];
        String enKısaKelime=isimler[0];
        for (int i = 0; i <isimler.length ; i++) {
            if (isimler[i].length()>enUzunKelime.length()){enUzunKelime=isimler[i];}
            if (isimler[i].length()<enKısaKelime.length()){enKısaKelime=isimler[i];}
        }
        System.out.println( "enUzunKelime:"+enUzunKelime+ " "+"enKısaKelime:" +enKısaKelime);
    }
}



