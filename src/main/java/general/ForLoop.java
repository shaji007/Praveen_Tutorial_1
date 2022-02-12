package general;

public class ForLoop {
    public static void main(String[] args) {
        int index = -1;
        int max = 50;
        for(int i = 1; i<= max; i+=3) {
            if(i%2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
            if(i%2 == 0) {
                index = i;
                break;
            }
        }
        System.out.println(index);
       /*String temp = "I love India";
        char[] array = temp.toCharArray();
        for (char x:array) {
            System.out.println(x);
        }*/
    }
}
