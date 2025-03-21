import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void sortPrices(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            sortPrices(arr, left, mid);
            sortPrices(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        while (i < n1) arr[k++] = leftArr[i++];
        while (j < n2) arr[k++] = rightArr[j++];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int books = sc.nextInt();

        int[] prices = new int[books];
        System.out.print("Enter the prices of book: ");
        for (int i = 0; i < books; i++) {
            prices[i] = sc.nextInt();
        }

        sortPrices(prices, 0, prices.length - 1);
        System.out.println("The sorted prices of books are: ");
        System.out.println(Arrays.toString(prices));
    }
}
/*
Enter the number of books: 5
Enter the prices of book: 100 140 90 170 67
The sorted prices of books are:
[67, 90, 100, 140, 170]
*/