package temperatura;

public class Temperatura {
   public static void main(String[] args) {
      Temp conversorTemperatura = new Temp(12);
      System.out.println(conversorTemperatura.getCelsius());
      System.out.println(conversorTemperatura.getFahrenheit());
   }
}