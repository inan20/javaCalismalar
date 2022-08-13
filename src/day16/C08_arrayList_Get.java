package day16;

import java.util.ArrayList;
import java.util.List;

public class C08_arrayList_Get {

    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("Ahmet");
        isimler.add("mehmet");
        isimler.add("ayse");
        System.out.println(isimler.get(1));// get sıtrıngi sıtring int inticır döndürür//
        List<Integer> sayılar=new ArrayList<>();
        sayılar.add(5);
        sayılar.add(10);
        sayılar.add(15);
        System.out.println(sayılar.get(1));// 10 get idexi numarası getırıyor//
    }
}
