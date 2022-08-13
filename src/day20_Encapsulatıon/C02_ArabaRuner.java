package day20_Encapsulatıon;

public class C02_ArabaRuner {


    public static void main(String[] args) {


        C01_Araba araba = new C01_Araba();
           araba.marka="toyota";
        System.out.println(araba.marka);//toyota
        // access modifier kullanarak marka variable'ina ulasimi
        // tamamen serbest yapabilir veya tamamen engelleyebilirim
        // private yaptigimiz model'e ise hic ulasamayiz
        // yani access modifier ya hep ya hic diyor
        // model' i degistirelim ama goremeyelim
        // yakiti'da gorelim ama degistiremeyelim
        // set ve get yetkilerini ozel olarak tanimlamak isterseniz
        // 1.adim - ozel yetki tanimlayacaginiz variable'lari private yapin
        //          private bir dataya baska class'lardan ulasmak mumkun olmadigindan
        // 2.adim - set yetkisi icin setter, get yetkisi icin getter methodlari olusturalim

        araba.setModel("corolla");// Model olarak "Supra"  atadık Ama göremedik yazdıramdık//

        System.out.println(araba.getYakıt());//Elektrkli yazdırdık

}

}