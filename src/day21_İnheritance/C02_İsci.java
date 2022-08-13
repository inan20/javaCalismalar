package day21_İnheritance;

 class C02_İsci extends C01_Personel {

     public static void main(String[] args) {
         C02_İsci isci1 = new C02_İsci();
         System.out.println(isci1.isim);/* isim belirtilmedi kendi
         classımızda yok parente gideriz    */
         isci1.isim = "ahmet";/*  parnt işci ismine atama yapabiliriz*/
         System.out.println(isci1.isim);// ahmet
         // /*ÖNEMLİ*////////////
         int Persno = 1001; /* varıable yoksa kendimiz oluşturabiliriz ve
         onu kullanabiliriz int ile kendi classımızda oluşturabiliriz.*/
        /* isci1.maas(); /* bu child classda işci methodu yokken  parentın işci methodu saut yazdırır
        yanı "" tüm personel maasi ""
        ancak biz işci methodu oluşturursak bizimki child işci maasi yazdırır*  */
       /*  //ÖNEMLİ///////////
         Chid class parent classı inherit edindiğinde
         1- parent classın bütün özelliklerine (variable,Method) sahip olur
         2- parent clssın bazı özelliklerini değiştirebilir
         3- parent classda olmayan bazı özellikler oluşturabilir.
         AMA parent class daki variable ve methodları reddedemez ama Değiştirebilir.*/
         isci1.maas();// işçi maası 15 euro //
     }
     public void maas() {
         System.out.println("işci maası 15 euro ");
     }
 }