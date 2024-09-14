// Age Group Calculator
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Age : ");
        int Age = input.nextInt();
        if (Age >= 60) {
            System.out.println("You Are Senior Citizen");
        }else if (Age >= 20) {
            System.out.println("You Are Adult");
        }else if (Age >= 13) {
            System.out.println("You Are Teenager");
        }else{
            System.out.println("You Are Child");
        }
    }
}
