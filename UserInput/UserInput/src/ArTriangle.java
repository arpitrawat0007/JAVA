import java.util.Scanner;
public class ArTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--Triangle Area Calulator--");
        System.out.print("Enter Base of Triangle : ");
        float Base = input.nextFloat();
        System.out.print("Enter Height Of Triangle : ");
        float Height = input.nextFloat();
        float Area = 0.5f*(Base*Height);
        System.out.println("The Area Of Triangle is : "+Area);
    }
}
