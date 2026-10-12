import java.util.Arrays;
import java.util.Random;

public class TaskThree {

    // Заповнення масиву випадковими числами
    public static void fillArray(int[] arr) {
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }

    // Сортування методом бульбашки
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Злиття двох відсортованих масивів
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Якщо залишилися елементи першого масиву
        while (i < arr1.length) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        // Якщо залишилися елементи другого масиву
        while (j < arr2.length) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        fillArray(arr1);
        fillArray(arr2);

        System.out.println("Перший масив:");
        System.out.println(Arrays.toString(arr1));

        System.out.println("Другий масив:");
        System.out.println(Arrays.toString(arr2));

        bubbleSort(arr1);
        bubbleSort(arr2);

        System.out.println("Перший після сортування:");
        System.out.println(Arrays.toString(arr1));

        System.out.println("Другий після сортування:");
        System.out.println(Arrays.toString(arr2));

        int[] result = mergeArrays(arr1, arr2);

        System.out.println("Третій масив:");
        System.out.println(Arrays.toString(result));
    }
}