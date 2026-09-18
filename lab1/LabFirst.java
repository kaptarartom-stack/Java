import java.util.Scanner;
public class LabFirst{
public static void main(String[] args) {
    /*
    1) вхідні дані — дійсного типу, результат — дійсного;
    2) вхідні дані — цілого типу, результат — дійсного;
    3) вхідні дані — дійсного типу, результат — цілого 
 ((n+1)*(m-4)+ n*m - pow(n,4)+ pow(m,3)) / pow((m+2), 2)   
*/

Scanner in = new Scanner(System.in);
System.out.print("Введіть n: ");
float n = in.nextFloat();
System.out.print("Введіть m: ");
float m = in.nextFloat();

float result = (float) (((n + 1) * (m - 4) + n * m - Math.pow(n, 4) + Math.pow(m, 3)) / Math.pow((m + 2), 2));
System.out.println("Результат=" + result);
// робота з масивом, що має координати і радіусом на початку координат(0;0)
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
