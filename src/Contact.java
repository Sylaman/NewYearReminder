public abstract class Contact {

    protected String name;

    public Contact(String name) {
        this.name = name;
    }

    protected abstract void sendMessage();

    protected abstract void print();

    public String getName() {
        return name;
    }
}