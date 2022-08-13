package day16;

import java.util.ArrayList;
import java.util.List;

public class C07_ListAddall {
    public static void main(String[] args) {
        List<Integer> sayılar=new ArrayList<>();
        List<Integer> sayılar1=new ArrayList<>();

        sayılar.add(2);
        sayılar.add(3);
        sayılar.add(5);
        sayılar1.add(10);
        sayılar1.add(15);
        sayılar1.add(17);
        sayılar1.add(20);
        sayılar.addAll(sayılar1);
        System.out.println(sayılar);//sayılar arrayına sayılar1 i ekler///[2,3,5,10,15,17,20]//;
        // saylar listinin 1.indexine sayılar1 listini ekler//
        sayılar.addAll(1,sayılar1);
        System.out.println(sayılar);//[2, 10, 15, 17, 20, 3, 5, 10, 15, 17, 20]//
        sayılar.add(1,10);
        System.out.println(sayılar);
    }

}
