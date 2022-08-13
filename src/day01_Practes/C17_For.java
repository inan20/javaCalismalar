package day01_Practes;

import java.util.ArrayList;
import java.util.List;

public class C17_For {
    public static void main(String[] args) {
        String str = ("aabbccde");

        birkereYazdır(str);
    }

    private static void birkereYazdır(String str) {

        String input = "";
        for (int i = 1; i < str.length(); i++) {
            if (!input.contains(str.substring(i,i+1))) {
                input +=str.substring(i,i+1);

            }



        }

        System.out.println(input);
    }
}