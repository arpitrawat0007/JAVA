import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = input.nextInt();
        System.out.println("Enter Second Number");
        int num2 = input.nextInt();
        int Multiply = num1*num2;
        System.out.println("The Multiplication of two number is : "+ Multiply);

    }
}
