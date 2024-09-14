import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number : ");
        int num1 = input.nextInt();
        System.out.println("enter second number : ");
        int num2 = input.nextInt();
        // Arithmetic operations performed
        System.out.println("Addition : "+num1+num2); // Additon
        System.out.println(num1-num2); // Substraction
        System.out.println("Multiplication : "+num1*num2); // Multiplication
        System.out.println("Divisoin : "+num1/num2); // division
        System.out.println("Modulus : "+num1%num2); // Modulus
    }
}
