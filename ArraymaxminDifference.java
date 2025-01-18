import java.util.Scanner;

public class ArrayMaxMinDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        int difference = max - min;

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
        System.out.println("Difference between max and min: " + difference);

        scanner.close();
    }
}
