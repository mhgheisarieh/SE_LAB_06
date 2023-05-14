import org.junit.Test;
import static org.junit.Assert.*;

public class BuilderTest {
    @Test
    public void testBuilderPattern() {

        PizzaDirector director = new PizzaDirector();
        PizzaBuilder builder = new PeperoniPizzaBuilder();
        Pizza pizza = director.buildPizza(builder);
        assertEquals("Pizza with thin crust dough, HOT sauce sauce, and cheese and pineapple topping.", pizza.toString());

    }
}