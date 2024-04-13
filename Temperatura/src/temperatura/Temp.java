package temperatura;

public class Temp {
   private int celsius;

   public Temp(int celsius) {
      this.celsius = celsius;
   }

   public int getCelsius() {
      return this.celsius;
   }

   public double getFahrenheit() {
      return (double)this.celsius * 1.8 + 32.0;
   }
}


    

