package day017;

public class C06_KamyonRuner {


    public C06_KamyonRuner() {
    }

    public static void main(String[] args) {
                /*1*/
        C05_Kamyon kamyon=new C05_Kamyon();
        System.out.println(kamyon.toString());
      /*  C05_Kamyon �zellikleri
                marka='marka belirtilmemi�'
        model='model belirtilmemi�'
        y�l=0
        fiyat=0  */

    /*2*/  C05_Kamyon kamyon2=new C05_Kamyon("man","as900",2005,250000);

        System.out.println(kamyon2.toString());
      /*  C05_Kamyon �zellikleri
                marka='man'
        model='as900'
        y�l=2005
        fiyat=250000 */

  /*3*/   C05_Kamyon kamyon3=new C05_Kamyon();


    }
}