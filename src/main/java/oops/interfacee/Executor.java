package oops.interfacee;

public class Executor {
    public static void main(String[] args) {
        System.out.println(Sedan.TEST);
        Sedan optra = new ChevroletOptra();
        optra.make();
        optra.addWheels();
        optra.addUpholstery();

        Sedan ciaz = new MaruthiCiaz();
        ciaz.make();
        ciaz.addWheels();
        ciaz.addUpholstery();
    }
}
