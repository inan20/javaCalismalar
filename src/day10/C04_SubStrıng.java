package day10;

    public class C04_SubStrıng {

        public static void main(String[] args) {
            String ism = "ahmet ınan";
            ism = ism.toUpperCase().substring(0,1)+ism.substring(1).replaceAll("\\w","*");
            System.out.println(ism);

            String ism2= "java cok kolay aha ";
            System.out.println(ism2.indexOf("a"));
            System.out.println(ism2.indexOf("a",(1+1)));
            System.out.println(ism2.indexOf("a",(3+1)));
            System.out.println(ism2.indexOf("a",(12+1)));
            System.out.println(ism2.indexOf("a",(15+1)));
            System.out.println(ism2.indexOf("a",(17+1)));





        }}





