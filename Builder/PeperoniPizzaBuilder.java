public class PeperoniPizzaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();

    @Override
    public void buildDough() {
        pizza.setDough("thin crust");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("HOT sauce");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("cheese and pineapple");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}