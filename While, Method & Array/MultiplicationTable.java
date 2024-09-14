// To Generate Multiplication Table of Any Number
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        greetUser();
        table();
    }

    public static void greetUser(){
        System.out.println("Welcome To Our Table Calculator");
    }
    
    public static void table(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number To Get Multiplication Table of that number : ");
        int num = input.nextInt();
        int i = 1;
        for(i=1 ; i<=10 ; i++){
            System.out.println(num+ " * " +i+ " = " +num*i);
        }
    }
}
