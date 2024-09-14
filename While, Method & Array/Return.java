import java.util.Scanner;
public class Return {
    public static void main(String[] args) {
    greet();
    int num1 = readNumber1();
    int num2 = readNumber2();
    int sum = num1 + num2;
    System.out.println("The sum of two number is : "+sum);
}
    public static void greet(){
    System.out.println("Welcome to Sum Calculator");
    }


    public static int readNumber1(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number : ");
        int num1 = input.nextInt();
        return num1; // return value of num1 to main function
    }

    public static int readNumber2(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter second number : ");
        int num2 = input.nextInt();
        return num2;  // return value of num2 to main function
    }

}
