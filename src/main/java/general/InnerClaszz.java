package general;

public class InnerClaszz {
    public static void main(String[] args) {
    }
    int y = 10;

    class ClassA{
        private int x =5;
        private String hello= "Hello";

        public void print() {
            for(int i=0;i<x; i++) {
                System.out.println(hello);
            }
            System.out.println(y);
        }
    }

    public void print() {
        System.out.println(new ClassA().x);
        System.out.println(new ClassA().hello);
        System.out.println(y);
    }
}
