package eus.ehu.designpatterns;

import eus.ehu.designpatterns.ingredients.*;

public interface PizzaIngredientFactory {
  public Dough createDough();
  public Sauce createSauce();
  public Cheese createCheese();
  public Veggies[] createVeggies();
  public Pepperoni createPepperoni();
  public Clam createClam();
}
