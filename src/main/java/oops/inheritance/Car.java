package oops.inheritance;

public class Car {
    public static int wheels = 4;
    private String color;
    private String type;
    private String fuel;
    private boolean isPremium;
    private boolean isAutomatic;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    protected void print() {
        System.out.println("Car has following properties " + this.toString());
    }

    @Override
    public String toString() {
        return "\n" +
                "color='" + color + '\n' +
                "type='" + type + '\n' +
                "fuel='" + fuel + '\n' +
                "isPremium='" + isPremium + '\n' +
                "isAutomatic=" + isAutomatic;
    }
}
