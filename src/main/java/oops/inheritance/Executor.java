package oops.inheritance;

public class Executor {
    public static void main(String[] args) {
        Benz benz = new Benz();
        benz.setColor("White");
        benz.setFuel("Diesel");
        benz.setType("Sedan");
        benz.setAutomatic(true);
        benz.setEmblem(true);
        benz.setPremiumUpholstry("Premium Leather");
        benz.setRadar("FB");
        benz.print();
    }
}
