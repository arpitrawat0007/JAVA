import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        System.out.println("Welcome to Ticket Discount Calcuator");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your age : ");
        int age = input.nextInt();
        System.out.print("Are you a female ? (true/false)");
        boolean isFemale = input.nextBoolean();
        if(age<5){
            System.out.println("You Got 75% Discount"); 
        } else if(isFemale){
            System.out.println("You Got 50% Discount");
        } else if(age>60 && !isFemale){
            System.out.println("You Got 25% Discount");
        } else{
            System.out.println("You Got No Discout");
        }
    }
}
