package oops.interfacee;

public class MaruthiCiaz implements Sedan{
    @Override
    public void make() {
        System.out.println("I am a MAruthi Suzuki Ciaz. I have hybrid engine.");
    }

    @Override
    public void addWheels() {
        System.out.println("I have normal alloy wheels " + wheels +" with regenerative breaking");
    }

    @Override
    public void addUpholstery() {
        System.out.println("I have Artificial leather upholstery.");
    }
}
