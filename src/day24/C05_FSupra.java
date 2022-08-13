package day24;

public class C05_FSupra extends C04_EToyota {
         /*    Kırmızı ok override yapıldğiını gösterir*/
    void yakıt(){
        System.out.println("supra benzinlidir");
    }
   /*  @Override notasyonu javaya bir görev verir
   birbirine bağlı iki methodu sürekli kontrol eder  Eğer Notasyonu silerseniz RTE verir  */

    @Override
    void motor() {
        System.out.println( "supraların motorları silindirlidir");
    }
}
