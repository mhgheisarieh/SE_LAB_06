
import org.junit.Test;
import static org.junit.Assert.*;

public class PrototypeTest {
    @Test
    public void testPrototypePattern() {
        ConcretePrototype prototype = new ConcretePrototype();
        Client client = new Client(prototype);
        Prototype copy = client.makePrototypeCopy();
        assertTrue(copy instanceof ConcretePrototype);
    }
}