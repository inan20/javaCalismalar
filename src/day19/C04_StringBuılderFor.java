package day19;

public class C04_StringBuılderFor {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java her zaman güzel");
        sb.delete(8,9);
        System.out.println(sb);//Java herzaman g�zel//
          int son=sb.length();
         for (int i = 0; i <sb.length() ; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);/*sout forin içinde olacak// soru:baştan başlayarak her loop ta
            ilk harfı sildirerek yazdır*/
        }/*
        va herzaman g�zel
        a herzaman g�zel
        herzaman g�zel
        herzaman g�zel
        erzaman g�zel
        rzaman g�zel
        zaman g�zel
        aman g�zel
        man g�zel
        an g�zel
        n g�zel
        g�zel
        g�zel
       �zel
       zel
       el
      l
*/


    }
}
