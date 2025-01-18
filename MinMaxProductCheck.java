// to find that the product of min and max of an array is multiple of each other 


import java.util.Scanner;

public class MinMaxProductCheck {
    public static boolean isProductMultipleOfMinMax(int[] array) {
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

        int product = min * max;


        return product % min == 0 && product % max == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        boolean result = isProductMultipleOfMinMax(array);
        System.out.println("Is the product of the minimum and maximum a multiple of both? " + result);

        scanner.close();
    }
}
