package day25_Exceptıon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C11_İçiçeExcaptıon {


            public static void main(String[] args) {
                int k;
                try {
                    FileInputStream fis = new FileInputStream("src/day39_exceptions/Test.txt");
                    /* bu obje test dosyasını okumak için oluşturuldu*/
                    while((k=fis.read()) !=-1){ // -1 dosyanın sonuna kadar oku demek//
                        System.out.print((char) k);
                        /* bu code dosyayı okutmak için read dosyadaki metnı char olarak
                     harf harf okuyup yazdırıyor*/

                    }
                } catch (FileNotFoundException e) {
                    System.out.println("Dosyadan bilgiler okunamadi");
                } catch (IOException e) {
                    System.out.println("Dosya bulunamadi"); //Dosyadan bilgiler okunamadi//
                }
    }
}
