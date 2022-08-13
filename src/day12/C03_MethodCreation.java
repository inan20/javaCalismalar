package day12;

public class C03_MethodCreation {


    public static void main(String[] args) {
        int input=543;
      rakamlarToplam(input);

    }




     public static void rakamlarToplam(int input){

         int birlerBasamagı=0;
         int rakamalartoplamaı=0;

         birlerBasamagı=input%10;
         rakamalartoplamaı+=birlerBasamagı;
         input/=10;

         birlerBasamagı=input %10;
         rakamalartoplamaı+=birlerBasamagı;
         input/=10;

         birlerBasamagı=input %10;
         rakamalartoplamaı+=birlerBasamagı;
         input/=10;

         System.out.println("rakamlar toplamı:"+input+rakamalartoplamaı);


     }





















}
