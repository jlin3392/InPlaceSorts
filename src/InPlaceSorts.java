public class InPlaceSorts {

    public static void selectionSort(double[] list1) {
        int minPos = 0;

        for (int i = 0; i < list1.length-1; i++) {
            double minVal = list1[i];

            for (int j = i + 1; j < list1.length; j++) {
                if (list1[j] < minVal) {
                    minVal = list1[j];
                    minPos = j;
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

    public static void insertionSort(int[] list1) {
        for (int i = 1; i < list1.length; i++) {
            for (int count = i; count > 0; count--) {
                if (list1[count] < list1[count-1]) {
                    swapInt(list1, count, count-1);
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

    public static void swapInt (int[] list1, int a, int b) {
        int temp = list1[a];
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

    public static int[] randomIntGen(int count)
    {
        int[] list= new int[count];
        for (int i=0; i<list.length; i++)
        {
            list[i]=(int) (Math.random() *10001);
        }
        return list;
    }

    public static double[] randomDoubleGen(int count)
    {
        double[] dlist= new double[count];
        for(int i=0; i<dlist.length; i++)
        {
            dlist[i]= Math.random()*10001;
            dlist[i]= Math.round((dlist[i]*100.00))/100.00;
        }
        return dlist;
    }

}
