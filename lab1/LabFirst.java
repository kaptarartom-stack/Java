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
in.close();
}
}
