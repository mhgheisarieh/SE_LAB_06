public class PepperoniPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PepperoniPizza();
    }

    @Override
    public Topping createTopping() {
        return new PepperoniTopping();
    }
}