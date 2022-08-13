package day15;

import java.util.Arrays;

public class C013_SortBinarySearch {
    public static void main(String[] args) {
           /*binary seach aranan elemanı sort tan sonra bulur*/
        String harfler[]={"d","k","l","b","y"};
        String arananHarf="a";
        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));//b,d,k,l,y //
        System.out.println(Arrays.binarySearch(harfler,arananHarf));//-1//

        int sayılar[]={3,5,9,4,15}; /* sayı varsa 0,1,2,3 index ile dönüyor
        sayı yoksa 1,2,3 sıralama ilenumaralandırıyor ve basına - koyuyor*/
        Arrays.sort(sayılar);
        System.out.println(Arrays.toString(sayılar));//3,4,5,9,15//
        System.out.println(Arrays.binarySearch(sayılar,3));//0
        System.out.println(Arrays.binarySearch(sayılar,5));//2
        System.out.println(Arrays.binarySearch(sayılar,20));//-6
        System.out.println(Arrays.binarySearch(sayılar,55));//-6
        System.out.println(Arrays.binarySearch(sayılar,-100));//-1
    }
}
