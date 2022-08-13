package day14;

public class C05_Scopeİnstance {



    int instSayı=20;
    public static void main(String[] args) {
        C05_Scopeİnstance obje1=new C05_Scopeİnstance();
        System.out.println(obje1.instSayı); // 20
        obje1.instSayı=30;
        System.out.println(obje1.instSayı);//30
        C05_Scopeİnstance obje2=new C05_Scopeİnstance();
        System.out.println(obje2.instSayı);//20   /*çünki her olustutrulan obje ilk
        // instanse instSayı 20 olduğu için basa döner*/
    }






















}
