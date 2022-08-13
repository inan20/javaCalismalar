package day07;

import java.util.Scanner;

public class C08_IF {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen cinsiyet giriniz");
        char cinsiyet = scan.next().charAt(0);
        System.out.println("lutfen yas giriniz");
        int yaş = scan.nextInt();
        if ('e' + 65 > yaş) {
            System.out.println("emekli olabilir");
        } else if ('k' + 60 > yaş) {
        }
    }}





