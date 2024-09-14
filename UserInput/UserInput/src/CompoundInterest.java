import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--Compound Interest Calculator--");
        System.out.print("Enter Value of Principle Amount : ");
        float P = input.nextFloat();
        System.out.print("Enter Rate % : ");
        float R = input.nextFloat();
        System.out.print("Enter Time : ");
        float T = input.nextFloat();
        float CompoundInterest = P*(1+R/100*T);
        System.out.println("Compound Interest = "+CompoundInterest);
    }
}
