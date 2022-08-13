package day00_Practes;

import java.util.Scanner;

public class C06_swithc {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir gün ismi giriniz");
        String gün=scan.nextLine().toLowerCase();
        if( gün.equals("pazartesi")|| gün.equals("salı")||gün.equals("carsamba")
                ||gün.equals("persembe")||
                        gün.equals("cuma"))
                {
            System.out.println("haftaici");
    }
else if (gün.equals("cumartesi")|| gün.equals("pazar"))
        { System.out.println("haftasonu");}







}}

