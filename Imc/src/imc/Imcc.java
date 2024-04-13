package imc;

import java.util.Scanner;

public class Imcc {
   private final Scanner scanner;

   public Imcc () {
      this.scanner = new Scanner(System.in);
   }

   private void determineBMICategory(double vic) {
      if (vic < 18.5) {
         System.out.println("Baixo do Normal");
      } else if (vic < 25.0) {
         System.out.println("Normal");
      } else if (vic < 30.0) {
         System.out.println("Demais Normal");
      } else if (vic < 35.0) {
         System.out.println("Obesidade 1");
      } else if (vic < 40.0) {
         System.out.println("Obesidade 2");
      } else {
         System.out.println("Obesidade 3");
      }

   }

   public void getIMC() {
      System.out.print("Digite o peso em kg: ");
      double weight = this.scanner.nextDouble();
      System.out.print("Digite a altura em metros: ");
      double height = this.scanner.nextDouble();
      double bmi = weight / (height * height);
      this.determineBMICategory(bmi);
   }
}
