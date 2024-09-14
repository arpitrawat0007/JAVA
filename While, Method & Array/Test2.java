import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.print("Eneter First Number : ");
        float num1 = input.nextFloat();
        System.out.print("Eneter Second Number : ");
        float num2 = input.nextFloat();
        float add = num1+num2;
        float mul = num1*num2;
        float sub = num1-num2;
        float div = num1/num2;
        float mod = num1%num2;
        boolean exit = true;
        while (exit = true) {
            System.out.println("Enter any operator code to perform operation : \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Modulus");

            int operator = input.nextInt();
            if (operator == 1) {
                System.out.println(num1+ " + " + num2 + " = "+ add);
            }
            if (operator == 2) {
                System.out.println(num1+ " - " + num2 + " = "+ sub);
            }
            if (operator == 3) {
                System.out.println(num1+ " * " + num2 + " = "+ mul);
            }
            if (operator == 4) {
                System.out.println(num1+ " / " + num2 + " = "+ div);
            }
            if (operator == 5) {
                System.out.println(num1+ " % " + num2 + " = "+ mod);
            }
            boolean y = true;
            boolean n = false;
            System.out.println("Do you Want to Calculcate More : y/n");
            boolean choice = input.nextBoolean();
            if (choice == y){
                exit = true;
            }
            else{
                exit = false;
            }
        }
    }
}

