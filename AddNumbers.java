import java.util.*;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double sum = 0.0;
        System.out.println("Enter four floating-point numbers: ");

        try {

            for(int i = 0; i < 4; i++){
                sum += in.nextInt();
            }
            System.out.printf("The sum of all correctly entered numbers is: %.2f\n", sum);
            
        } catch (InputMismatchException e) {
            System.out.println("You have an invalid entry!!");
            System.out.printf("The sum of all correctly entered numbers is: %.2f\n", sum);
        }

        in.close();
    }
}
