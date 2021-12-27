public class ArraySample {
    private final String[] stringArray = {"Orange", "Apple"};

    public static void main(String[] args) {
        ArraySample arraySample = new ArraySample();
        arraySample.exploreArray();
    }

    public ArraySample() {

    }

    public void exploreArray() {
        System.out.println(stringArray[0]);
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 6;
        intArray[2] = 9;
        // intArray[4] = 5;
        //System.out.println(intArray.length);
        for (int temp:intArray) {
            System.out.println(temp);
        }
    }
}