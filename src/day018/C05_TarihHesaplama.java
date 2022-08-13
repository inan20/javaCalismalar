package day018;

import java.time.LocalDate;
import java.time.Period;

public class C05_TarihHesaplama {
    public static void main(String[] args) {
        LocalDate tarih=LocalDate.of(1978,3,14);
        LocalDate bugün=LocalDate.now();
        Period period=Period.between(bugün,tarih);


        System.out.println(period);//P-44Y-4M-15D doğalı olmuş.

    }
}
