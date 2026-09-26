
import java.util.Scanner;
public class TaskSecond{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введiть a: ");
        float a = input.nextFloat();

        System.out.print("Введiть b: " );
        float b = input.nextFloat();

        System.out.print("Введiть c: ");
        float c= input.nextFloat();

        Qequation q =  new Qequation(a,b,c);

        System.out.println("\nКiлькiсть коренiв:");
        System.out.println(q.countSquares());
        double[] roots = q.findSquares();

        if (roots == null) {
            System.out.println("Дiйсних коренiв немає");
        } else {
            System.out.println("Коренi:");

            for (double root : roots) {
                System.out.println(root);
            }
        }
        input.close();
    }
}
