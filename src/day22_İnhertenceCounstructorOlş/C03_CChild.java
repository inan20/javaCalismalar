package day22_İnhertenceCounstructorOlş;

public class C03_CChild {
    private String granpaKlupAdi;
    private String parentKlupAdi;

    public class C03_Child extends C02_BParent {
        String isim = "Child isim belirtilmedi";
        protected String childKlupAdi = "Child Klubu";

        C03_Child() {
            System.out.println("Child constructor calisti");
        }

        public static void main(String[] args) {
            C01_AGrandParent gp1 = new C01_AGrandParent();
            // bu objeyi olusturmak icin Granpa Cons. calisir,
            // Parent veya Child cons calismaz
            C03_CChild child1 = new C03_CChild();
            child1.granpaKlupAdi = "Child1";
            child1.parentKlupAdi = "Child2";
            // child1 objesi icin Child cons calisir
        /*
          Java'da bir class'i kullanabilmek icin
          o class'dan obje olusturur, dolayisiyla
          o class'in constructor'ini kullanirdik
          Java inheritance'da parent class'lardaki
          ozellikleri kullanabilmek icin
          o class'larin constructor'larini
          otomatik calistiran bir yapi kurmustur.
          Ornegin biz child class'inda
          Child class'indan bir obje olusturmak istedigimizde
          Child cons. ini kullaniriz
          Java Child(){} gordugunde
          once parent'in constuctor'ini calistirmam lazim der
          buradan Parent cons'a gider
          Parent class'inda Parent(){} gorunce
          once bunun parent'inin yani Granparent cons.
          calismasi gerekir der
          Boylece extends keyword olmayan class'a kadar gider
          ve oradan baslayarak tum constructorlari
          asagi dogru calistirir
         */
        }
    }
}