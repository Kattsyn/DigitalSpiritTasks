import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        solution(arr, a, b);

    }

    public static void solution(int[] arr, int a, int b) {
        if (a < 0 || b < 0 || a >= arr.length || b >= arr.length || a == b) {
            System.out.println("NO");
        } else {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            for (int j : arr) {
                System.out.println(j);
            }
        }
    }
}