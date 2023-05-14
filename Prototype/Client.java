public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype makePrototypeCopy() {
        return prototype.clone();
    }
}