// To Find Perimeter of Rectangle
import java.util.Scanner;
public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--Rectangle Perimeter Finder--");
        System.out.print("Enter Length of Rectangle : ");
        float length = input.nextFloat();
        System.out.print("Enter Breadth of Rectangle : ");
        float breadth = input.nextFloat();
        float perimeter = 2*(length+breadth);
        System.out.println("The Perimeter of Rectangle is : "+perimeter);
    }
}
