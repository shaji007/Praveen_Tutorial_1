package general;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int quo = b / a;
        int mod = b % a;
/*
        System.out.println("Addition of " + a + " and " + b + " = " + sum);
        System.out.println("Subtraction of " + a + " and " + b + " = " + diff);
        System.out.println("Multiplication of " + a + " and " + b + " = " + prod);
        System.out.println("Division of " + b + " and " + a + " = " + quo);
        System.out.println("Modulus of " + b + " and " + a + " = " + mod);
        System.out.println("Incrementer : " + ++b);
        System.out.println("Decrementer : " + --b);
        b+=20;//b = b + 20
        System.out.println(b);
        b-=5; //b = b - 5
        System.out.println(b);*/
        System.out.println("Equals check :" + (a == b));
        System.out.println("Not Equals check :" + (a != b));
        System.out.println("Greater check :" + (a > b));
        System.out.println("Lesser check :" + (a < b));
        System.out.println("Greater equal check :" + (a >= b));
        System.out.println("lesser equal check :" + (a <= b));


        System.out.println("And operation :" + ((a > b) && (a != b)));
        System.out.println("Or operation :" + ((a > b) || (a != b)));
        System.out.println("Not operation :" + !(a < b));
    }

    public void generateNumbers() {
        String someString = "";
    }
}
