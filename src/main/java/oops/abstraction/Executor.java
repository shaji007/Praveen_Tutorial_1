package oops.abstraction;

public class Executor {
    public static void main(String[] args) {
        System.out.println(FourWheeler.TEST);
        JeepCar jeepCar= new JeepCar();
        jeepCar.design();
        jeepCar.brand();
        jeepCar.horn();
        jeepCar.run();

        SedanCar sedanCar = new SedanCar();
        sedanCar.design();
        sedanCar.brand();
        sedanCar.horn();
        sedanCar.run();
    }
}
