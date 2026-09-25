import java.util.Scanner;

public class TaskFirst {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введіть x першої точки: ");
        float x1 = input.nextFloat();

        System.out.print("Введіть y першої точки: ");
        float y1 = input.nextFloat();

        Point point1 = new Point(x1, y1);

        System.out.print("Введіть x другої точки: ");
        float x2 = input.nextFloat();

        System.out.print("Введіть y другої точки: ");
        float y2 = input.nextFloat();

        Point point2 = new Point(x2, y2);

        System.out.println("\nПерша точка:");
        point1.print();

        System.out.println("Друга точка:");
        point2.print();

        System.out.println("\nВідстань першої точки до початку координат: "
                + point1.distanceStart());

        System.out.println("Відстань між точками: "
                + point1.distanceBetweenTwoPoints(point2));

        System.out.println("\nПолярні координати першої точки:");
        point1.toPolar();

        System.out.println("\nПолярні координати другої точки:");
        point2.toPolar();

        if (point1.match(point2)) {
            System.out.println("\nТочки співпадають.");
        } else {
            System.out.println("\nТочки не співпадають.");
        }

        System.out.print("\nНа скільки перемістити першу точку по X: ");
        float dx = input.nextFloat();

        System.out.print("На скільки перемістити першу точку по Y: ");
        float dy = input.nextFloat();

        point1.moveX(dx);
        point1.moveY(dy);

        System.out.println("Перша точка після переміщення:");
        point1.print();

        input.close();
    }
}