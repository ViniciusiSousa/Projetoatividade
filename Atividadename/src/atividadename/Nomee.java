package Atividadename;

public class Nomee {
   private String name;
   private int age;

   public Nomee(String name, int age) {
      this.name = name;
      this.age = age;
   }

   public String getName() {
      return this.name;
   }

   public int getAge() {
      return this.age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public void verifyAge() {
      if (this.age >= 18) {
         System.out.println(this.name + " \u00e9 maior de idade");
      } else {
         System.out.println(this.name + " n\u00e3o \u00e9 maior de idade");
      }

   }
}

