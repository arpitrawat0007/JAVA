// To Determine Largest Num. out of Three
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = input.nextInt();
        System.out.print("Enter Third Number : ");
        int num3 = input.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1+" is the Largest Number out of three");
        } else if (num2>num3 && num2>num1){
            System.out.println(num2+" is the Largest Number out of three");       
        }else{
            System.out.println(num3+" is the Largest Number out of three");
        }
    }
}
