public class HelloWorld {
    String name = "Praveen";

    public static void main(String[] arg) {
        int no = 1;
        float f = 0.9f;
        double d = 0.9;
        boolean flag = true;
        System.out.println("Hello " + new HelloWorld().name + "!!!!!");
        int x = (int) d;
        System.out.println("Double: " + d);
        System.out.println("Int casted : " + x);
    }
}
