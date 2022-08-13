package day16;

import java.util.*;

public class C018_Random {
    public static void main(String[] args) {
        /*  list oluşturun 200 adet 1000 den küçük kullanıcıdan sayı istyınız
         listede olup olmadığını karsılaştırınız*/
        Random rnd = new Random();
        int sayı = 0;
        List<Integer> sayıList = new ArrayList<>();
        while (sayıList.size() < 200) {
            sayı = rnd.nextInt(1000);
            if (!sayıList.contains(sayı))
                sayıList.add(sayı);


        }
        System.out.println(sayıList);
        boolean doğruMu = false;
        int defadenediniz = 1;
        Scanner scan = new Scanner(System.in);
        while (doğruMu == false) {
            System.out.println("lütfen Sayı giriniz");
            int girilenSayı = scan.nextInt();
            if (sayıList.contains(girilenSayı)){
            System.out.println("girilen sayı listede var" + defadenediniz+"defadenediniz");
            doğruMu=true;}
             else {
                System.out.println("girilen sayı listede yok" + defadenediniz+"defadenediniz");
                defadenediniz++;
             }
        }}}
