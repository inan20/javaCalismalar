package day12;

public class C01_MethodCreation {

    public static void main(String[] args) {
        
        
        int input1=10;
        int input2=20;


        // method 4 adimda olusturulur
        // 1.adim method call
        // 2.adim argument eklenmesi gerekiyorsa ekleyelim
        //   eger method'un return type void'den farkli olacaksa
        //   bir variable olusturup, method call'u assign edelim

        topla(input1,input2);


    }

   // public static void topla(int input1, int input2) {
        // 3.adim method deklarasyonunda degistirilmesi gereken
        // bolumleri degistir (access modifier, return Type vb..)
        // 4. eger return type void disinda bir seyse
        //    return keywor'u ve donecek degeri hesaplamaliyiz
       // System.out.println("Girilen iki sayinin toplami : "+ (input1+input2));


    //topla(input1,input2);//argument//
        


    public static void topla(int input1, int input2) {//parametre//

        System.out.println(input1+input2);

    }

}
