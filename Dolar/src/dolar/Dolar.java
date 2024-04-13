package Dolar;

public class Dolar {
   public Dolar () {
   }

   public static void main(String[] args) {
      double valorConvertidoEmDolares = 50.0;
      double taxaDeCambio = 5.99;
      double valorEmReais = valorConvertidoEmDolares * taxaDeCambio;
      System.out.printf("O valor em d\u00f3lares %.2f \u00e9 equivalente a %.2f reais.", valorConvertidoEmDolares, valorEmReais);
   }
}
