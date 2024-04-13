package Carro;

public class Carroo {
   private String model;
   private int year;
   private String color;
    private int currentYear;

   public Carroo (String model, int year, String color) {
      this.model = model;
      this.year = year;
      this.color = color;
   }

   public void displayTechnicalSheet() {
      System.out.println("Model: " + this.model);
      System.out.println("Year: " + this.year);
      System.out.println("Color: " + this.color);
   }

   public int calculateAge() {
      return currentYear - this.year;
   }

   public String getModel() {
      return this.model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public int getYear() {
      return this.year;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public String getColor() {
      return this.color;
   }

   public void setColor(String color) {
      this.color = color;
   }
}