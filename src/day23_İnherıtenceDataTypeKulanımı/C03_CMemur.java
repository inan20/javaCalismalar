package day23_İnherıtenceDataTypeKulanımı;

public class C03_CMemur extends C02_BMuhasebe {

        protected int saatÜcretı=15;
        protected int mesaiUcreti=10;


    @Override
    protected void maas() {
    }

    @Override
    protected void sigorta() {

    }

     /*C03_CMemur mmr1=new C03_CMemur();
        System.out.println(mmr1.gunlukMesai); // 9
        System.out.println(mmr1.saatUcreti); // 12
        mmr1.maas(); // Memurlar : 3240 maas alir
        mmr1.ozelSigorta(); // Memurlar %60 indirimli ozel sigorta yaptirabilir
        mmr1.sigorta(); // Personel
        System.out.println(mmr1.isim); // Personel
        System.out.println(mmr1.soyisim); // Personel
        System.out.println(mmr1.departmant);//Personel  */



        C02_BMuhasebe mhsb1= new C02_BMuhasebe();
        /*
        Her ne kadar Memur class'inin icinde olsak da
        olusturdugumuz obje Muhasebe class'indan
        cunku data turu ve constructor BMuhasebe
        String str="Murat";
        ArrayList<Integer> list=new ArrayList<>();
        Integer sayi=20;
        BMuhasebe class'i da obje olusturulabilen bir class'dir yanidata turudur
    */
      /*  System.out.println(mhsb1.gunlukMesai); // 8  Muhasebe
        System.out.println(mhsb1.saatUcreti); // 10 Muhasebe
        mhsb1.maas(); // Muhasebe Personel minumum : 2400 maas alir
        mhsb1.ozelSigorta(); // Muhasebe Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        mhsb1.sigorta(); // Personel Tum personelimiz sigorta yapilir
        System.out.println(mhsb1.isim); // Personel
        System.out.println(mhsb1.soyisim); // Personel
        System.out.println(mhsb1.departmant);//Personel
        */

}






