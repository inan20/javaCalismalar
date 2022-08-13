package day16;

import java.util.Arrays;

public class C01_MultıDimensıonalArray {
    public static void main(String[] args) {
        int[][]arr={{1,2},{3,4},{5,6}};
        System.out.println(arr[0][1]);// 2
        System.out.println(arr[1][0]);//3
        System.out.println(Arrays.toString(arr[0]));//[1,2]
        System.out.println(Arrays.toString(arr[1]));//[3,4]
        System.out.println(Arrays.deepToString(arr)); //{{1,2},{3,4},{5,6}};//
    }
}
