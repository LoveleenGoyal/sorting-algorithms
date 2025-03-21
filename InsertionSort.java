import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void sortEmployeeIds(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i- 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int employees = sc.nextInt();

        int[] employeeID = new int[employees];
        System.out.print("Enter the employee IDs: ");
        for (int i = 0; i < employees; i++) {
            employeeID[i] = sc.nextInt();
        }

        sortEmployeeIds(employeeID);
        System.out.println("Employee IDs in sorted manner are: ");
        System.out.println(Arrays.toString(employeeID));
    }
}
/*Enter the number of employees: 4
Enter the employee IDs: 106 189 101 142
Employee IDs in sorted manner are:
[101, 106, 142, 189]
*/