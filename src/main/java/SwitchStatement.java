import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Options\n 1. Orange\t2. Apple\t3.Pineapple\t4.Banana");
        System.out.println("Enter an option to select a fruit");
        int option = scanner.nextInt();
        String text = "You have selected ";
        String selection = "";
        switch (option){
            case 1:
                selection = "Orange";
                break;
            case 2:
                selection = "Apple";
                break;
            case 3:
                selection = "Pineapple";
                break;
            case 4:
                selection = "Banana";
                break;
            default:
                selection = "Mango";
                break;
        }
        System.out.println(text + selection);
    }
}

