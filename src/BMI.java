import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        double bMI, kg, m ;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight :");
        kg = input.nextDouble();
        System.out.print("Enter your height :");
        m = input.nextDouble();
         bMI = kg/(m * m);
         System.out.println("Your bMI: " + bMI);
    }
}
