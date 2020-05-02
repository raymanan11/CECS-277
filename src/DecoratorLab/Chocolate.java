// a concrete instance of ice cream
package DecoratorLab;


public class Chocolate extends Dessert {
 public static final double COST = 1.09;
 
 public Chocolate() {
  description = "Rich chocolate";
 }

 public double cost() {
  return COST;
 }
}
