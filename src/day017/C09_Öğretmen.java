package day017;

public class C09_Öğretmen {

       String isim="isim belirtilmedi";
       String soyısım="soyısım Belirtilmedi";
       String Branşı="bramş belirtilmedi";
       String doğumTarihi="doğumTarihi belirtilmedi";



    public C09_Öğretmen(String isim, String soyısım, String branşı, String doğumTarihi,String yanbıranşı) {
        this.isim = isim;
        this.soyısım = soyısım;
        this.Branşı = branşı;
        this.doğumTarihi = doğumTarihi;
    }

    C09_Öğretmen (){

                }


    @Override
    public String toString() {
        return "C09_Öğretmen{" +
                "isim='" + isim + '\'' +
                ", soyısım='" + soyısım + '\'' +
                ", Branşı='" + Branşı + '\'' +
                ", doğumTarihi='" + doğumTarihi + '\'' +
                '}';
    }

    public C09_Öğretmen(String Ahmet) {
    }
}
