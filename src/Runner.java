public class Runner {
    public static void main(String[] args) {

        String[] testArr = InPlaceSorts.randomStringArr(5, 5);
        String[] before = testArr;

        System.out.println("Before: ");
        for (String word:testArr) {
            System.out.println(word + " ");
        }
        System.out.println();

        long time = System.nanoTime();
        InPlaceSorts.bubbleSort(testArr);


        System.out.println("After: ");
        for (String word:testArr) {
            System.out.println(word + " ");
        }
        System.out.println();


        time = System.nanoTime() - time;
        System.out.println("Time taken: " + time);

    }
}
