package day017;

public class C05_Kamyon {


    public String marka="marka belirtilmemiş";
    public String model="model belirtilmemiş";
    public int yıl;
    public int fiyat;

   /*2*/ public C05_Kamyon(String marka, String model, int yıl, int fiyat) {
          this.marka=marka;
          this.model=model;
          this.yıl=yıl;
          this.fiyat=fiyat;
    }
    /* sağ tuş gerenate toSirıng tıkla  @Override*/

    @Override  /*1*/
    public String toString() {
        return "C05_Kamyon özellikleri "+
                "\nmarka='" + marka + '\'' +
                "\n model='" + model + '\'' +
                "\n yıl=" + yıl +
                "\nfiyat=" + fiyat ;
    }

    public C05_Kamyon(String marka) {
        this.marka = marka;
    }

    C05_Kamyon(){

}}
