package day16;

import java.util.ArrayList;
import java.util.List;

public class C017_arryıListe_Aktarma {

    public static void main(String[] args) {

        int[]arr={1,2,3,4,5,6,7,8,9,10};// çok elemanlı bir arryı tek tek lıst e eklemek yerine
       // tek seferde eklemek//

        List<Integer> sayılar=new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
          sayılar.add(arr[i]);{


            }
        }


        System.out.println("yenilist:"+sayılar);

    }
}
