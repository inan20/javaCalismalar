package day017;

public class C07_Otobus {
    /*1*/
    public String marka="marka belirtilmemiş";
    public String model="model belirtilmemiş";
    public int yıl;
    public int fiyat;

 /*2*/   public C07_Otobus(String marka, String model, int yıl, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yıl = yıl;
        this.fiyat = fiyat;
    }


     /*3*/  @Override
    public String toString() {
        return "C07_Otobus{" +
                "\nmarka=" + marka +
                "\n model=" + model ;
    }

   /*4*/ public C07_Otobus(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

     C07_Otobus(){

    }




}
