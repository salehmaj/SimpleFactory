public class TestStore {

    public static void main (String[] args) {
        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);

        pizzaStore.orderPizza("margharita");
        pizzaStore.orderPizza("pepperoni");
    }
}
