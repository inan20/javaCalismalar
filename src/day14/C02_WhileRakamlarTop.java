package day14;

public class C02_WhileRakamlarTop {
    public static void main(String[] args) {

        int input = 5421;
        int rakamlarToplamı = 0;
        int birlerBasamağı = 0;
        while (input > 0) {
            birlerBasamağı = input % 10;
            rakamlarToplamı +=birlerBasamağı;
            input /= 10;
            System.out.println(rakamlarToplamı);

        }

    }
}
