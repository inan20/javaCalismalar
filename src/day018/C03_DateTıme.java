package day018;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class C03_DateTıme {
    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);//2022-07-29

        System.out.println(tarih.getDayOfMonth());//ayın 29.gün
        System.out.println(tarih.getDayOfYear());//yılıın 210.gün
        System.out.println(tarih.getMonthValue());//yılın7. ayı
        System.out.println(tarih.getDayOfWeek());// friday haftanın günü


        System.out.println(tarih.isLeapYear()); // false
        LocalDate tarih2= LocalDate.of(2001,5,15);
        System.out.println(tarih2); // 2001-05-15
        LocalDate tarih3= LocalDate.of(1990, Month.JANUARY,10);
        System.out.println(tarih3); // 1990-01-10
        System.out.println(tarih.plusDays(100)); // 2022-10-31
        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12)); // 2027-11-04
        System.out.println(tarih.minusWeeks(20)); // 2022-03-05
        System.out.println(tarih.minusDays(100).minusMonths(5)); // 2021-11-14
        System.out.println(tarih.isAfter(tarih2)); // true
      ////////********ÖNEMLİ SORU*******//////////
        // iki farkli dogum gunu girildiginde
        // hangisinde doganin daha buyuk oldugunu bulunuz
        // tarih2 ve tarih3 icin yapalim
        if (tarih2.isAfter(tarih3)){
            System.out.println(tarih3 + " tarihinde dogan daha buyuk");
        } else if(tarih2.isBefore(tarih3)){
            System.out.println(tarih2 + " tarihinde dogan daha buyuk");
        } else{
            System.out.println("iki tarih birbiri ile ayni");
        }







    }
}
