import org.junit.Test;
import static org.junit.Assert.*;

public class AbstractFactoryTest {
    @Test
    public void testAbstractFactoryPattern() {
        PizzaFactory factory1 = new PepperoniPizzaFactory();

        Pizza pizza1 = factory1.createPizza();
        Topping topping1 = factory1.createTopping();

        assertEquals("Pepperoni Pizza", pizza1.getName());
        assertEquals("Pepperoni Topping", topping1.getName());

        PizzaFactory factory2 = new MushroomPizzaFactory();

        Pizza pizza2 = factory2.createPizza();
        Topping topping2 = factory2.createTopping();

        assertEquals("Mushroom Pizza", pizza2.getName());
        assertEquals("Mushroom Topping", topping2.getName());
    }
}
