package main;

class Main {
  public static void main(String[] args) {
  Drink drink1 = new Drink ("Coke");
  Drink drink2 = new Drink ("Apple juice");
  Drink drink3 = new Drink ("Water");

  Ordering order1 = new Ordering();
  order1.addOrder(drink1);
  order1.addOrder(drink2);
  order1.addOrder(drink3);
  System.out.println(order1.getNextTenOrders());
  }
}