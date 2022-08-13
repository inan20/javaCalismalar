package day017;

public class C04_ArabaRunner {

    public static void main(String[] args) {

        C03_Araba araba=new C03_Araba();
       araba.marka="toyota";
       araba.model="corolla";
       araba.yıl=2020;
       araba.fiyat=50000;

        System.out.println("marka:"+araba.marka+"\nmodel:"+ araba.model+

               "\naraba yıl:"+araba.yıl+  "\n araba fiyat:"+araba.fiyat);


        C03_Araba araba2=new C03_Araba("bmw","x5", 2020,50000);
        System.out.println("marka:"+araba2.marka+"\nmodel:"+ araba2.model+

                "\naraba yıl:"+araba2.yıl+  "\n araba fiyat:"+araba2.fiyat);
//COUNSTRUCTER OBJE KALIBI///////
/*marka:toyota
model:corolla
araba y�l:2020
 araba fiyat:50000*/

        /*marka:bmw
         model:x5
         araba y�l:2020
         araba fiyat:50000*/














    }


}
