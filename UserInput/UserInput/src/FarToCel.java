import java.util.Scanner;
public class FarToCel {
    public static void main(String[] args) {
        System.out.println("--Fahrenheit To Celsius Calculator--");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value of Fahrenheit : ");
        float F = input.nextFloat();
        float C = (F-32)*5/9;
        System.out.println(F+"°F = "+C +"°C");
    }
}
