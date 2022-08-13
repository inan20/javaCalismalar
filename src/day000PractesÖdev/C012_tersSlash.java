package day000PractesÖdev;

public class C012_tersSlash {

    public static void main(String[] args) {
	/*  \n (or \r): starts from a new line : metni bir alt satirdan itibaren yazdirir.
	          \t:  horizontal tab : metni yatayda 1 tab miktari kaydirir.
	          \\: prints a back slash :\ (ters slash) yazdirir
	          \': prints single quote :' tek tirnak yazdirir.
	          \": prints double quote :"" cift tirnak yazdirir.*/

         String str1="\"Java\",\"World\"\\ // \"";
        System.out.println(str1);
        String str="Java ile hayat cok afilli";
        System.out.print("\"java\"");
        System.out.print("ile hayat cok");
        System.out.print("\"afilli\"");
         // deger aktarma//
          int x=123456;
         double y=123.3;
         double a=(double)y+x;

        System.out.println("\nP\na\nz\na\nr\nt\ne\ns\ni");
        System.out.println("\"Java\" ile hayat cok \'afilli\'\n \"Zaruret\" insanı\n kasif yapar\n\n\n\t techoproedidation");
}}