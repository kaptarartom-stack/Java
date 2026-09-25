
import java.util.Scanner;
public class TaskSecond{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введіть a");
        float a = input.nextFloat();

        System.out.print("Введіть b");
        float b = input.nextFloat();

        System.out.print("Введіть c ");
        float c= input.nextFloat();

        Qequation q =  new Qequation(a,b,c);

        System.out.println("\nКількість коренів:");
        System.out.println(q.countSquares());
        input.close();
    }
}
