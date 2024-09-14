// For Chechking odd even number by bitwise operator
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number to check whether it is Even or Odd : ");
        int num = input.nextInt();
        if ((num & 1) == 1) {
            System.out.println("The Number is Odd");
        }
        else{
            System.out.println("The Number is Even");
        }
    }
}
