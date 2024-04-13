package atividadededinheiro;

public class Moneyy {
   private double money;

   public Moneyy(double money) {
      this.money = money;
   }

   public void getMoney() {
      System.out.println("Saldo: " + this.money);
   }

   public void setMoney(double money) {
      this.money += money;
   }

   public void withdrawMoney(double money) {
      if (this.money <= money) {
         System.out.println("Saldo insuficiente");
      } else {
         this.money -= money;
         System.out.println("Opera\u00e7\u00e3o realizada com sucesso.");
      }

   }
}
