import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--Simple Interest calculator--");
        System.out.print("Enter Value of Principle Amount : ");
        float P = input.nextFloat();
        System.out.print("Enter Rate % : ");
        float R = input.nextFloat();
        System.out.print("Enter Time : ");
        float T = input.nextFloat();
        float SimpleInterest = (P*R*T)/100;
        System.out.println("Simple Interest = "+SimpleInterest);
    }
}
