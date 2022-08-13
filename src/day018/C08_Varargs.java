package day018;

public class C08_Varargs {


        public static void main(String[] args) {
            String[] Kelime = {"Havva", "Ahmet", "YunusEmre", "Fatih", "Neva"};

            enUzunKelime(5,"Havva","Ahmet","YunusEmre","Fatih","Neva");

    /*
     Varargs teorik olarak sonsuz sayida element alabilir
     bir method'da parametre olarak varargs varsa
     varargs'in sinirlarini bilebilmesi icin
     parametrelerin sonuncusu olmalidir.
     oncesinde farkli parametreler olabilir ama
     varargs'dan sonra parametre OLAMAZ
     Bu kuraldan oturu bir method'da sadece 1 tane varargs olabilir
     */

        }


        private static void enUzunKelime(int sayı, String...Kelime) {

            String enUzunKelime = Kelime[0];
            for (int i=0; i <Kelime.length; i++) {
                if (Kelime[i].length()>enUzunKelime.length()){

                    enUzunKelime=Kelime[i];}
            }
            System.out.println(enUzunKelime);
        }

    }


