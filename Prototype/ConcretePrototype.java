
public class ConcretePrototype implements Prototype {

    @Override
    public Prototype clone() {
        return new ConcretePrototype();
    }
}