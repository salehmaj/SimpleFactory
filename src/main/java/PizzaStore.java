public class PizzaStore {
    Pizza pizza;

    public Pizza orderPizza(String type) {
        if (type.equals("margharita")) {
            pizza = new Margharita("margharita");
        }
        if (type.equals("pepperoni")) {
            pizza = new Pepperoni("pepperoni");
        }
        if (type.equals("4fromages")) {
            pizza = new QuatreFromage("4 fromages");
        }
        if (type.equals("vegie")) {
            pizza = new Vegie("vigie");
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
