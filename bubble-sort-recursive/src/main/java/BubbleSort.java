import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        arr = bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] bubbleSort(int[] arr, int n) {
        if (n <= 1) {
            return arr;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return bubbleSort(arr, n - 1);
    }

}