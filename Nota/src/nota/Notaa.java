package Nota;

public class Notaa {
   public Notaa () {
   }

   public void calculador(int[] grades) {
      double sum = 0.0;
      int[] var7 = grades;
      int var6 = grades.length;

      for(int var5 = 0; var5 < var6; ++var5) {
         int grade = var7[var5];
         sum += (double)grade;
      }

      double mean = sum / (double)grades.length;
      System.out.println("A m\u00e9dia \u00e9: " + mean);
   }
}
