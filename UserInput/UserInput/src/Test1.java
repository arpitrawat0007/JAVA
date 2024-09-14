// To calculate product of two float numbers
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter First Number : ");
    float num1 = input.nextFloat();
    System.out.println("Enter Second number : ");
    float num2 = input.nextFloat();
    float Multipliy = num1*num2;
    System.out.println("The Multiplication of two Float number is : "+Multipliy);
    }
}
