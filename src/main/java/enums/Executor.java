package enums;

public class Executor {
    public static void main(String[] args) {
        NumberEnum[] numbers = NumberEnum.values();
        for(NumberEnum temp: numbers) {
            System.out.println(temp.ordinal());
        }
        NumberEnum numberEnum = NumberEnum.ONE;
        switch (numberEnum) {
            case ZERO:
                System.out.println("Zero");
                break;
            case ONE:
                System.out.println("One");
                break;
            default:
                System.out.println(numberEnum.getNumber());
                break;
        }
    }
}
