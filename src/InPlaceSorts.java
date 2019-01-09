public class InPlaceSorts {

    public static void iterationSort(int[] list1) {

    }

    public static void selectionSort(double[] list1) {
        for (int i = 0; i < list1.length-1; i++) {
            double minVal = list1[i];
            int minPos = 0;

            for (int j = i + 1; j < list1.length; j++) {
                if (list1[j] < minVal) {
                    minVal = list1[j];
                    minPos = i;
                }
                swapDouble(list1, minPos, i);
            }
        }
    }

    public static void bubbleSort(String[] list1) {
        while (!checkSort(list1)) {
            for (int i = 0; i < list1.length - 1; i++) {
                if (list1[i].compareTo(list1[i + 1]) > 0) {
                    swapString(list1, i, i + 1);
                }
            }
        }
    }

    public static void swapString (String[] list1, int a, int b){
        String temp = list1[a];
        list1[a] = list1[b];
        list1[b] = temp;
    }

    public static void swapDouble (double[] list1, int a, int b) {
        double temp = list1[a];
        list1[a] = list1[b];
        list1[b] = temp;
    }

    public static boolean checkSort (String[]list1){
        for (int i = 0; i < list1.length - 1; i++) {
            if (list1[i].compareToIgnoreCase(list1[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static String[] randomStringArr (int num, int length)  {
        String[] arr = new String[num];

        while (num > 0) {
            int i = 0;
            String s = "";

            while(i < length) {
                char c = (char)((Math.random()*26) + 97);
                s = s + c;
                i++;
            }

            num--;
            arr[num] = s;
        }

        return arr;
    }

    public static double[] randomDoubleArr (int length, int decimals) {

    }
}
