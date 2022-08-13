package day19;

public class C02_StringBuılderMethodları {
    public static void main(String[] args) {
        String input="Java çalışmak güzeldir";
        String tersinput=tersinecevir(input);
        System.out.println(tersinput);
    }

    private static String tersinecevir(String input) {
        StringBuilder sb=new StringBuilder(input);
        return sb.reverse().toString();//toString strbuılder i stringe cevirir//
    }
}
