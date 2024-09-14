import java.util.Scanner;
public class Unary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number to perform Unary operation : ");
        int i = input.nextInt();
        int j = -i; // -i
        System.out.println(j);
        j = ++i;    // ++i
        System.out.println(j);
        j = --i;    // ++i
        System.out.println(j);
        j = i++;    // ++i
        System.out.println(j);
        j = i++;    // ++i
        System.out.println(j);
    }
}
