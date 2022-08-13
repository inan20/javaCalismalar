package day15;

import java.util.Arrays;

    public class C04_ArrSolaKaydırma {
    public static void main(String[] args) {
        // arr elkementlerini sola kayydır//////////
     int arr[]={1,2,3,4,5};
     int ilk=arr[0];
        for (int i = 0; i < arr.length-1 ; i++) {
             arr[i]=arr[i+1];

        }
        arr[arr.length-1]=ilk;
        System.out.println(Arrays.toString(arr));
        // arr elemanlarını saga kaydır///////////
      int Arr[]={1,2,3,4,5};
      int son=Arr[arr.length-1];
        for (int i =arr[Arr.length-1]; i <0 ; i--) {
            Arr[i]=Arr[i-1];
        }
         son=arr[0];
        System.out.println(Arrays.toString(Arr));







        }

    }













