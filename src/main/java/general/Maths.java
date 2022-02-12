package general;

public class Maths {
    int a;
    int b;
    public Maths() { //default constructor
        a = 5;
        b = 3;
    }

    public Maths(int a, int b) { // Parameterized constructor
        this.a = a;
        this.b = b;
    }

    public int sum() { // Method without parameters
        return this.a + this.b;
    }

    public int sum(int a, int b) { // Method with
        return a + b;
    }

    public int sumXTimes(int start, int count) {
        int x = 0;
        for(int i = 0; i< count ; i++) {
            int y = x + start;
            x = y;
        }
        return x;
    }

    public int addRecursively(int max) {
        if(max == 0)
        {
            return 0;
        } else {
            return max + addRecursively(max - 1);
        }
    }

    public int factorial(int max) {
        if(max == 0) {
            return 1;
        } else {
            return max * factorial(max - 1);
        }
    }

    public int altFactorial(int max) {
        int ret = 1;
        for( int i = 1; i<= max; i++) {
            ret = ret * i;
        }
        return ret;
    }
}