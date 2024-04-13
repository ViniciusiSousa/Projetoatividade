package Nota;

import java.util.Scanner;

public class Nota {
   public Nota() {
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int[] grades = new int[3];
      Nota mean = new Nota ();

      for(int i = 0; i < 3; ++i) {
         System.out.println("Digite a " + i + "\u00b0 nota");
         grades[i] = scanner.nextInt();
      }

   }
}
