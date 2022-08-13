package day25_Exceptıon;

public class C02_exceptıon_TryCacth {
    public static void main(String[] args) {


        try { int [] a={1,2,3,4,5};
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("arrayın sınırını aştınız");
        }


    }
}
