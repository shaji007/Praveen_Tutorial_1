package oops.abstraction;

public abstract class FourWheeler {
    static final String TEST = "Test";
    protected String car = "Carrrrrr";
    public int wheels= 4;

    public void run() {
        System.out.println("run run run with "+ wheels + " wheels " + car);
    }

    public abstract void design();

    public void horn() {
        System.out.println("pom pom");
    }

    public abstract void brand();
}
