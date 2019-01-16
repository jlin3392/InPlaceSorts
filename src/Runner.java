public class Runner {
    public static void main(String[] args) {

        //Bubble sort with String[]
        String[] StringArr = InPlaceSorts.randomStringArr(5, 5);
        String[] StringBefore = StringArr;

        System.out.println("Before: ");
        for (String word:StringArr) {
            System.out.println(word + " ");
        }
        System.out.println();

        long StringTime = System.nanoTime();
        InPlaceSorts.bubbleSort(StringArr);


        System.out.println("After: ");
        for (String word:StringArr) {
            System.out.println(word + " ");
        }
        System.out.println();

        StringTime = System.nanoTime() - StringTime;
        System.out.println("Time taken: " + StringTime);


        //Insertion sort with int[]
        int[] intArray = InPlaceSorts.randomIntGen(5);
        int[] intBefore = intArray;

        System.out.println("Before: ");
        for (int num:intArray) {
            System.out.println(num + " ");
        }
        System.out.println();

        long intTime = System.nanoTime();
        InPlaceSorts.insertionSort(intArray);

        System.out.println("After: ");
        for (int num:intArray) {
            System.out.println(num + " ");
        }
        System.out.println();


        intTime = System.nanoTime() - intTime;
        System.out.println("Time taken: " + intTime);

        //Selection Sort with double
        double[] doubleArray = InPlaceSorts.randomDoubleGen(5);
        double[] doubleBefore = doubleArray;

        System.out.println("Before: ");
        for (double num:doubleArray) {
            System.out.println(num + " ");
        }
        System.out.println();

        long doubleTime = System.nanoTime();
        InPlaceSorts.selectionSort(doubleArray);

        System.out.println("After: ");
        for (double num:doubleArray) {
            System.out.println(num + " ");
        }
        System.out.println();

        doubleTime = System.nanoTime() - doubleTime;
        System.out.println("Time taken: " + doubleTime);





    }
}
