
package Variavel;

public class Variavel {
   public Variavel () {
   }

   public static void main(String[] args) {
      double precoDeCompra = 100.0;
      double descontoPercentualProduto = 10.0;
      double valorDesconto = precoDeCompra * (descontoPercentualProduto / 100.0);
      double novoPreco = precoDeCompra - valorDesconto;
      System.out.printf("O pre\u00e7o com %.2f%% de desconto \u00e9: R$%.2f", descontoPercentualProduto, novoPreco);
   }
}
