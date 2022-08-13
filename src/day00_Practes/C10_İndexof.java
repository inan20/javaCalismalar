package day00_Practes;

public class C10_İndexof {

    public static void main(String[] args) {
        String str="asdfgghhjkkıuytrrre";
        int ilkr=str.indexOf("r");
        int ikincir=str.indexOf("r",ilkr+1);
         if (ikincir==-1)  {System.out.println("ikinci r yokdur");}
       else  {
           System.out.println("ikincir var");}
        int üçüncür=str.indexOf("r",ikincir+1);
        if (üçüncür==-1) {
           System.out.println("üçüncü r yokdur " );
      } else   {
           System.out.println("üçüncür vardır");}

       }

    }












