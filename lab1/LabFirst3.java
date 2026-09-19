import java.util.Scanner;

public class LabFirst3 {

    public static float[][] input(Scanner in, int size, String name) {

        float[][] matrix = new float[size][size];

        System.out.println("Введіть елементи матриці " + name + ":");

        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {

                System.out.print(name + "[" + (i+1) + "," + (j+1) + "] = ");
                matrix[i][j] = in.nextFloat();

            }
        }

        return matrix;
    }


    public static int[] buildVector(float[][] arrA, float[][] arrB, int size) {

        int[] vectX = new int[size];

        for (int i = 0; i < size; ++i) {

            boolean equal = true;

            // Порівнюємо i-й рядок A з i-м стовпцем B
            for (int j = 0; j < size; ++j) {

                if (arrA[i][j] != arrB[j][i]) {
                    equal = false;
                    break;
                }

            }

            if (equal) {
                vectX[i] = 1;
            } else {
                vectX[i] = 0;
            }
        }

        return vectX;
    }


    // Виведення вектора
    public static void printVector(int[] vector) {

        System.out.println("Вектор:");

        for (int i = 0; i < vector.length; ++i) {
            System.out.print(vector[i] + " ");
        }

        System.out.println();
    }


    public static void main(String[] args) {

        // Є 2  квадратні матриці, треба збудувати вектор,
        // який працює за правилом:
        // i-ий рядок A збігається з i-им стовпцем B -> 1,
        // не збігається -> 0

        Scanner in = new Scanner(System.in);

        System.out.print("Введіть розмір матриць: ");
        int size = in.nextInt();

        if (size <= 15 && size > 0) {

            float[][] arrA = input(in, size, "A");
            float[][] arrB = input(in, size, "B");
            int[] vectX = buildVector(arrA, arrB, size);
            printVector(vectX);

        } else {
            System.out.println("Розмір матриць повинен бути від 1 до 15.");
        }

        in.close();
    }
}


