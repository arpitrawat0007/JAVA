// To Determine The Number Is Even Or Odd
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("The Given Number is An Even Number");
        } 
        else {
            System.out.println("The Given Number is An Odd Number");
        }
    }
}
