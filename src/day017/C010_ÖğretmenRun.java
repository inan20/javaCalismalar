package day017;

public class C010_ÖğretmenRun {

    public static void main(String[] args) {
        C09_Öğretmen öğretmen=new C09_Öğretmen("ahmet","inan","anaokulu","1978","din klt");
         öğretmen.isim="ahmet";
         öğretmen.soyısım="inan";
         öğretmen.Branşı="anaokulu";
         öğretmen.doğumTarihi="1978";
        System.out.println("öğretmen.isim:"  +öğretmen.isim+ "\n"+"öğretmen.soyısım:"+öğretmen.soyısım+"\n" +
                "öğretmen.Branşı:"+ öğretmen.Branşı+"\n"+"öğretmen.doğumTarihi :"+öğretmen.doğumTarihi);
/*
��retmen.isim  :ahmet
��retmen.soy�s�m:inan
��retmen.Bran��:anaokulu
��retmen.do�umTarihi :1978
*/

       C09_Öğretmen öğretmen1=new C09_Öğretmen();













    }
}
