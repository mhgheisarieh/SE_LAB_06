public class MushroomPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new MushroomPizza();
    }

    @Override
    public Topping createTopping() {
        return new MushroomTopping();
    }
}