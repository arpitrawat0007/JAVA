import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age = input.nextInt();
        if(age >= 18){
            System.out.println("You Can Vote.");
        } 
        else {
            System.out.println("You Can't Vote.");
        }
    }
}