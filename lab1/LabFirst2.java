import java.util.Scanner;

public class LabFirst2 {
    public static void main(String[] args) {

Scanner in = new Scanner(System.in);
System.out.print("Введіть розмір масиву: ");
int size = in.nextInt();
if (size % 2 == 0 && size <= 200) {

    float[] arr = new float[size];

    System.out.println("Введіть елементи масиву:");

    for (int i = 0; i < size; i++) {
        arr[i] = in.nextFloat();
    }

    System.out.println("Введіть радіус кола:");
    float r = in.nextFloat();

    int count = 0;

    for (int i = 0; i < size; i += 2) {
        float x = arr[i];
        float y = arr[i + 1];

        if (x * x + y * y <= r * r) {
            count++;
        }
    }

    System.out.println("Кількість точок, що належать площині кола: " + count);

} else {
    System.out.println(
        "Або заданий розмір масиву більше 200, " +
        "або розмір масиву непарний"
    );
}
in.close();
    
}
}
