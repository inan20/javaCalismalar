package day13;

public class C09_NestedForloop {
    public static void main(String[] args) {


         int input=4;
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i =input-1; i >= 1; i--) {
            for (int j =i; j >=1; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }


        }







    }

