import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
    public static void sortAges(int[] ages) {
        int minAge = 10, maxAge = 18;
        int range = maxAge - minAge + 1;

        int[] count = new int[range]; // Count array
        int[] output = new int[ages.length]; // Output array

        // Step 1: Count occurrences
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Step 2: Compute cumulative counts
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Place elements in sorted order
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            output[count[age - minAge] - 1] = age;
            count[age - minAge]--;
        }

        // Copy sorted values back to original array
        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] ages = new int[n];
        System.out.print("Enter the ages of students: ");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        sortAges(ages);

        System.out.println("Sorted student ages:");
        System.out.println(Arrays.toString(ages));
    }
}
/*Enter the number of students: 5
Enter the ages of students: 10 15 14 18 10
Sorted student ages:
[10, 10, 14, 15, 18]
*/