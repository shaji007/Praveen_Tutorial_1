package oops.inheritance;

public class Benz extends Car {
    private boolean emblem;
    private String premiumUpholstry;
    private String radar;

    public boolean isEmblem() {
        return emblem;
    }

    public void setEmblem(boolean emblem) {
        this.emblem = emblem;
    }

    public String getPremiumUpholstry() {
        return premiumUpholstry;
    }

    public void setPremiumUpholstry(String premiumUpholstry) {
        this.premiumUpholstry = premiumUpholstry;
    }

    public String getRadar() {
        return radar;
    }

    public void setRadar(String radar) {
        this.radar = radar;
    }

    @Override
    protected void print() {
        System.out.println("Benz Properties");
        super.print();
    }

    @Override
    public String toString() {
        return super.toString() + "\nemblem=" + emblem + '\n' +
                "premiumUpholstry='" + premiumUpholstry + '\n' +
                "radar='" + radar + '\n';
    }
}
