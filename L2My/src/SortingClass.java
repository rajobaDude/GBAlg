public class SortingClass {

    public static void sortBubble(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1])
                    changeElements(arr, j, j + 1);
            }
        }
    }

    public static void sortSelect(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minElement = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minElement])
                    minElement = j;
            }
            changeElements(arr, i, minElement);
        }

    }

    public static void sortInsert(int[] arr){
        int in, out;
        for (out = 1; out < arr.length; out++) {
            int temp = arr[out];
            in = out;
            while (in > 0 && arr[in - 1] >= temp){
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in] = temp;
        }
    }

    private static void changeElements(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
