import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int products = sc.nextInt();

        int[] prices = new int[products];
        System.out.print("Enter the product prices: ");
        for (int i = 0; i < products; i++) {
            prices[i] = sc.nextInt();
        }

        quickSort(prices, 0, prices.length - 1);
        System.out.println("The product prices in sorted manner are: ");
        System.out.println(Arrays.toString(prices));
    }
}
/*
Enter the number of products: 4
Enter the product prices: 100 4 50 45
The product prices in sorted manner are:
[4, 45, 50, 100]
*/