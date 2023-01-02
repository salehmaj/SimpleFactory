public class Margharita extends Pizza{
    public Margharita (String name) {
        super(name);
    }

    public void prepare() {
        System.out.println("Preparing pizza " + name);
    }

    public void bake() {
        System.out.println("Baking pizza " + name);
    }

    public void cut() {
        System.out.println("Cutting pizza " + name);
    }

    public void box() {
        System.out.println("Boxing pizza " + name);
    }
}
