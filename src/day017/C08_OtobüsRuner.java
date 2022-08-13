package day017;

public class C08_OtobüsRuner {
    public static void main(String[] args) {
        C07_Otobus otobus=new C07_Otobus();
        otobus.marka="mersedes";
        otobus.model="302";
        otobus.yıl=2010;
        otobus.fiyat=20000;
        System.out.println("\notobus.marka"+otobus.marka+"\notobus.model"+otobus.model+"\notobus.yıl"+
              otobus.yıl+"\notobus.fiyat"+otobus.fiyat);


  /*2*/    C07_Otobus otobus1=new C07_Otobus("man","302",2001,15000);
        System.out.println("\notobus özellikleri:"+"\nmarka:"+otobus1.marka+"\nmodel:"+otobus1.model+"\nyıl:"+
                otobus1.yıl+"\nfiyat:"+otobus1.fiyat);

      /*  otobus �zellikleri:
        marka:man
        model:302
        y�l:2001
        fiyat:15000  */

        C07_Otobus otobus3=new C07_Otobus();

        /*3*/
        System.out.println(otobus3.toString());
       /* marka=marka belirtilmemi�
          model=model belirtilmemi� */


   /*4*/  C07_Otobus otobus4=new C07_Otobus();
        System.out.println(otobus4.toString());

/*marka=marka belirtilmemi�
 model=model belirtilmemi�*/

    }
}
