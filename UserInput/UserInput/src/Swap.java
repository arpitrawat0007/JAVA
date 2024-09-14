import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number to swap with second one (FirstNum): ");
        int a = input.nextInt();
        System.out.print("enter Second number to swap with first one (SecondNum): ");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("First num after Swaping = "+a );
        System.out.print("Second num after Swaping = "+b );
}
}