package Carro;

public class Carro {
   public Carro () {
   }

   public static void main(String[] args) {
      Carroo car1 = new Carroo ("Toyota Camry", 2018, "Red");
      Carroo car2 = new Carroo ("Honda Civic", 2016, "Blue");
      Carroo car3 = new Carroo ("Ford Mustang", 2020, "Black");
      System.out.println("Car 1:");
      car1.displayTechnicalSheet();
      System.out.println("Car 2:");
      car2.displayTechnicalSheet();
      System.out.println("Car 3:");
      car3.displayTechnicalSheet();
      System.out.println("Age of Car 1: " + car1.calculateAge() + " years");
      System.out.println("Age of Car 2: " + car2.calculateAge() + " years");
   }
}
