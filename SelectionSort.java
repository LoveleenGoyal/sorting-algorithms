import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void sortScores(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();

        int[] scores = new int[students];
        System.out.print("Enter the student scores: ");
        for (int i = 0; i < students; i++) {
            scores[i] = sc.nextInt();
        }

        sortScores(scores);
        System.out.println("The sorted scores of each student is: ");
        System.out.println(Arrays.toString(scores));
    }
}
/*Enter the number of students: 4
Enter the student scores: 100 95 32 100
The sorted scores of each student is:
[32, 95, 100, 100]
*/