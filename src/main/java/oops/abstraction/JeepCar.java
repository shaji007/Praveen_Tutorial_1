package oops.abstraction;

public class JeepCar extends FourWheeler{
    @Override
    public void design() {
        System.out.println("Jeep has " + wheels + " wheels");
    }

    @Override
    public void brand() {
        System.out.println("Mahindra");
    }
}
