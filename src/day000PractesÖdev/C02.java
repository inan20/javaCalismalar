package day000PractesÖdev;

public class C02 {


    public static void main(String[] args) {




      String b = "Java 1235 ?!@$_";
      b=b.replaceAll("\\d","");
        System.out.println(b);
       b= b.replaceAll("\\W","");
        System.out.println(b);
        b=b.replaceAll("_","");
        System.out.println(b);
        System.out.println(b+" "+"Guzeldir");


}
}