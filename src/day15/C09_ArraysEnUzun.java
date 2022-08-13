package day15;

public class C09_ArraysEnUzun {


    public static void main(String[] args) {

        int sayılar[]={3,5,9,11,17};

        enBüyükSayı(sayılar);

    }

    private static void enBüyükSayı( int[] sayılar ) {
        int enBüyükSayı=sayılar[0];

        for (int i = 0; i < sayılar.length ; i++) {
            if (sayılar[i]>enBüyükSayı){enBüyükSayı=sayılar[i];

        }

    }

            System.out.println(enBüyükSayı);
}}
