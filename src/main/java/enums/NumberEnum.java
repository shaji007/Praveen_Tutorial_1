package enums;

public enum NumberEnum {
    ZERO(2),
    ONE(4),
    TWO(6),
    THREE(8);

    private int number;
    NumberEnum(int i) {
        number = i;
    }

    public int getNumber() {
        return number;
    }
}