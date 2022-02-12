package oops;

public class Executor {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setName("Pravin");
        encapsulation.setAge(33);

        System.out.println(encapsulation.getName() + "'s age is " + encapsulation.getAge());
    }
}
