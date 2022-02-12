package oops.interfacee;

public class ChevroletOptra implements Sedan{
    @Override
    public void make() {
        System.out.println("I am a chevy Optra. I look awesome!!!");
    }

    @Override
    public void addWheels() {
        System.out.println("Adding diamond cut alloy wheels");
    }

    @Override
    public void addUpholstery() {
        System.out.println("Adding pure leather upholstery");
    }
}
