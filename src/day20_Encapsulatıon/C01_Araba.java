package day20_Encapsulatıon;

public class C01_Araba {
    // marka'nin access modifier'i default access modifier
    // oldugundan, package icerisinde kullanilabilir
   // private String yakit="Elektrikli"; // tum arabalar elektrikli ise bu variable'in
    // degistirilmemesi lazim
    // private yaptigimiz model ve yakit variable'larina erisimi yetkilendirelim
    // model'e deger atanabilsin ama gorulemesin(setter)
    // yakit ise gorulebilsin ama yeni deger atanamasin isteniyor (getter)
    //

        String marka="Marka belirtilmedi";
      private   String model="Model belirtilmedi";
       private String yakıt="Elektrikli";

    public String getYakıt() {
        return yakıt;
    }

    public void setModel(String model) {
        this.model = model;
    }
}


