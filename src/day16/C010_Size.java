package day16;

import java.util.ArrayList;
import java.util.List;

public class C010_Size {
    public static void main(String[] args) {

        List<Integer> sayılar=new ArrayList<>();
        sayılar.add(6);
        sayılar.add(8);
        sayılar.add(10);
        sayılar.size();
        System.out.println(sayılar.size());//3//


    }

    public static class C09_Set {
        public static void main(String[] args) {
            List<Integer> sayılar=new ArrayList<>();
            sayılar.add(6);
            sayılar.add(8);
            sayılar.add(10);
            sayılar.set(1,25);// [6,25,10] üst satırda (8) silineni yazdırır
            /*index de istenilen elemanı siler yerine istediğimizi yazdırır
            ayrıca sildiğini 1 kereye mahsus üst satıra yazdırır*/
            System.out.println(sayılar);

        }
    }
}
