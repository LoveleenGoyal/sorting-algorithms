import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {
    public static void sortSalary(int[] arr) {
        int n = arr.length;

        for (int i =  n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of job applicants: ");
        int applicants = sc.nextInt();

        int[] salary = new int[applicants];
        System.out.print("Enter the salary of job applicants: ");
        for (int i = 0; i < applicants; i++) {
            salary[i] = sc.nextInt();
        }

        sortSalary(salary);
        System.out.println("The sorted salary of job applicants:");
        System.out.println(Arrays.toString(salary));
    }
}
/*Enter the number of job applicants: 6
Enter the salary of job applicants: 60000 45000 30000 1000000 42321 82832
The sorted salary of job applicants:
[30000, 42321, 45000, 60000, 82832, 1000000]
*/