package my.first;

public class Fish {

    public void publicDoThis() {
        System.out.println("This is a public method");
        privateDoThis();
    }

    private void privateDoThis() {
        System.out.println("This is a private method");
    }

    void defaultDoThis() {
        System.out.println("This is a default method");
    }

    protected void protetedDoThis() {
        System.out.println("This is a protected method");
    }
}