package day19;

public class C03_StrıngBuılderİndexOf {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Pay attention please");
        System.out.println(sb.indexOf("Pay")); //0
        System.out.println(sb); // Pay attention please
        System.out.println(sb.indexOf("e")); // 7
        System.out.println(sb.indexOf("e",10)); // 16
        System.out.println(sb.lastIndexOf("e")); // 19
        System.out.println(sb.lastIndexOf("e",10)); // 7

            //replace//////
        StringBuilder sb1= new StringBuilder("Calm down");
        sb.replace(5,10,"Up");
        System.out.println(sb);
        sb.replace(4,5,"---"); // Calm---Up
        System.out.println(sb);
        sb.replace(4,7," ");
        System.out.println(sb); // Calm Up
        sb.replace(5,7,"down");
        System.out.println(sb); // Calm down






    }
}
