package main;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Ordering<Drink> {
  private Stack<Drink> myOrder = new Stack<>();
  
 public void addOrder(Drink dr) {
  myOrder.push(dr);
  }

  public List<Drink> getNextTenOrders(){
    List<Drink> drinklist = new LinkedList<>();
    if (!myOrder.empty()){
      for (int i = 0; i <10; i++){
        if (!myOrder.empty()){
        drinklist.add(myOrder.pop());
          } else{
          break;
          }
        }
      return drinklist;
    } else{
      return null;
      }
    }
}
    