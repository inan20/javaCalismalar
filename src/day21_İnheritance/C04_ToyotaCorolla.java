package day21_İnheritance;

public class C04_ToyotaCorolla extends C03_Toyota {

 public static void main(String[] args) {
        /*
          child class'dan parent class'a erisimde
          access modifier kurallarini bypass edemeyiz
          ornegin parent class'daki private class uyelerini child class'dan kullanamayiz
          ayni sekilde parent ve child farkli package'larda ise
          parent class'daki default access modifier'i olan
          class uyelerini child class'dan kullanamayiz
         */
   C04_ToyotaCorolla arb1 = new C04_ToyotaCorolla();
    System.out.println(arb1.marka); // Toyota
    System.out.println(arb1.model); // Model belirtilmedi

}}