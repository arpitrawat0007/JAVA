import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum of Two Number is : " + sum);
    }
}
