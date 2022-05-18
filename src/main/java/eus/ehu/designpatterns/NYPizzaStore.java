package eus.ehu.designpatterns;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientsFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

//        } else if (item.equals("veggie")) {
//            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
//            return new NYStyleClamPizza();
//        } else if (item.equals("clam")) {
//            return new NYStylePepperoniPizza();
//        }

        return pizza;
    }
}
