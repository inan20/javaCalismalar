package day13;

public class C012_NestFrLop {
    public static void main(String[] args) {

    String input="Ahmet";
        for (int i=1; i <=input.length(); i++) {
            for (int j= 1;j<=i; j++) {
                System.out.print(input.substring(j-1,j));
            }
            System.out.println("");
        }



    }
}
