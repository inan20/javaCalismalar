package day22_İnhertenceCounstructorOlş;

public class C01_AGrandParent {
    protected String isim="Grandpa ismi belirtilmedi";
    /*
      Her class'da gorunmese bile bir constructor vardir
      Bu class'dan obje olusturmak istedigimizde
      default constructor devreye girecektir.
      Default constructor'i gozlemleyemeyecegimiz icin
      onun yerine kullanilabilecek parametresiz constructor olusturalim
     */
    protected String granpaKlupAdi="Grandpa Klubu";
    C01_AGrandParent (){
        System.out.println("Grandpa constructor calisti");
    }
}
