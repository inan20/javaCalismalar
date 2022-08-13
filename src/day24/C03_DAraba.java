package day24;

public class C03_DAraba {
    void yakıt() {
        System.out.println("arabalar yakıt kullanır");
    }

    /* Overridding yapmak istemediğiniz Methodları Acces modifierlerini  Pravite,Statıc,Final yapabilirsiniz*/
    void marka() {
        System.out.println("tüm arabaların markaları vardır");
    }
    void motor(){
        System.out.println("Arabalrın motorları vardır");
    }
}
