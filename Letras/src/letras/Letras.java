package Letras;

public class Letras {
   public Letras () {
   }

   public static void main(String[] args) {
      char charValue = 'A';
      String stringValue = "example";
      String message = "A letra \u00e9 " + charValue + " e a palavra \u00e9 \"" + stringValue + "\".";
      System.out.println(message);
   }
}
