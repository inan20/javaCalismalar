package day00_Practes;

public class C019 {


    /*
      name1 ve name2 degiskenlerini olusturun.
      name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
      name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
                e.g:
               name1= mehmet
               name2= ahmet
               Print ==> mehahmetmet
      */
   /* public static void main(String[] args) {
        String name1 = "mehmet";
        String name2 = "ahmet";
        if(name1.length()%2==0){
            System.out.println(name1.substring(0,name1.length()/2).concat(name2).concat(name1.substring(name1.length()/2)));
        }else
            System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");

*/

    public static void main(String[] args) {


      String name1="mahmut";
      String name2="mehmet";

      if (name1.length()%2==0){
          System.out.println(name1.substring(0,name1.length()/2)+(name2)+(name1.substring(name1.length()/2)));}

    else{
              System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");

    }
    }}