import java.util.Scanner;

public class MinMaxProductCheck {
    public static boolean isProductMultipleOfMinMax(int[] array) {
        // Find minimum and maximum in the array
        int min = array[0];
        int max = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // Calculate product of min and max
        int product = min * max;

        // Check if the product is a multiple of both min and max
        return product % min == 0 && product % max == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input the array elements
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Call the function and print the result
        boolean result = isProductMultipleOfMinMax(array);
        System.out.println("Is the product of the minimum and maximum a multiple of both? " + result);

        scanner.close();
    }
}
