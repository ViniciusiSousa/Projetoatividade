package atividadededinheiro;;

public class Dinheiro {
   public Dinheiro () {
   }

   public static void main(String[] args) {
      Moneyy machine = new Moneyy (200.0);
      machine.getMoney();
      machine.setMoney(200.0);
      machine.getMoney();
      machine.withdrawMoney(500.0);
      machine.setMoney(200.0);
      machine.withdrawMoney(500.0);
      machine.getMoney();
   }
}

