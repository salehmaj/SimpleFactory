public abstract class Pizza {
    String name;
    public Pizza (String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}
