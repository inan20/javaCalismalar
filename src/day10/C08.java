package day10;

public class C08 {
 public static void main(String[] args) {


  String str = "Java gu123zel bah**ar gibi4";
  str=str.replaceAll("\\d","");
  str=str.replaceAll("\\W"," ");
  str=str.replace("bah  ar","bahar");

  System.out.println(str);

 }
}