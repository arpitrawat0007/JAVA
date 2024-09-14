// Grade Calculator based on Percentage

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Percentage To Get Grade : ");
        float Percentage = input.nextFloat(); 
        if (Percentage >= 90) {
            System.out.println("A Grade");
        }else if (Percentage >= 75) {
            System.out.println("B Grade");
        }else if (Percentage >= 60) {
            System.out.println("C Grade");
        }else if (Percentage >= 30) {
            System.out.println("D Grade");
        }else{
            System.out.println("F Grade");
        }
    }
}
