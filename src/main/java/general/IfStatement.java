package general;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Enter a number to check if it is odd or even");
        int number = scanner.nextInt();
        if(number%2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }*/
        System.out.println("Enter an option 1. Square 2. Square root 3. Is Prime");
        int option = scanner.nextInt();
        while(option > 3) {
            System.out.println("Enter a valid option");
            option = scanner.nextInt();
        }
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        if( option == 1) {
            System.out.println(number * number);
        } else if ( option == 2 ) {
            System.out.println(Math.sqrt(number));
        } else if (option == 3) {
            boolean flag = true;
            for ( int i =2; i < number; i++) {
                if(number%i == 0) {
                    flag = false;
                }
            }
            System.out.println(flag ? "Prime" : "Non Prime");
            if(flag) {
                System.out.println("Prime");
            } else {
                System.out.println("Non Prime");
            }
        }
    }
}
