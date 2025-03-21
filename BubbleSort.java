import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void sortMarks(int[] marks) {
        int n = marks.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1 ; j++) {
                if(marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();

        int[] marks = new int[students];
        System.out.print("Enter the marks of each student: ");
        for (int i = 0; i < students; i++) {
            marks[i] = sc.nextInt();
        }

        sortMarks(marks);
        System.out.println("The marks of students in sorted manner is:");
        System.out.println(Arrays.toString(marks));
    }
}
/*Enter the number of students: 5
Enter the marks of each student: 90 45 56 89 34
The marks of students in sorted manner is:
[34, 45, 56, 89, 90]
*/