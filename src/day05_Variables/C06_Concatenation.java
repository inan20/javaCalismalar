package day05_Variables;

public class C06_Concatenation {
   public static void main(String[] args) {
      String str1="JAVA";
      String str2="GUZELDIR";
      int sayi1=5;
      int sayi2=4;
      System.out.println(str1+" "+str2+" "+sayi1+sayi2 );// JAVA GUZEDIR 54//
      System.out.println(str1+"  "+str2+" "+(sayi1+sayi2));
      System.out.println((sayi1+sayi2)+" "+str1);
      System.out.println((""+sayi1+sayi2)+" "+str2);
      System.out.println(str1.concat(" ").concat(str2));


   }





   }
