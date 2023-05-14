public class PizzaDirector {
    public Pizza buildPizza(PizzaBuilder builder) {
        builder.buildDough();
        builder.buildSauce();
        builder.buildTopping();
        return builder.getPizza();
    }
}