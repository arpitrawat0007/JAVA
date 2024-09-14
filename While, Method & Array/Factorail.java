// To Calculate Factorial of given number
import java.util.Scanner;
public class Factorail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number to Get Factorial : ");
        int num = input.nextInt();
        long factorial = fact(num);
        System.out.println("Factorial is : " +factorial);
    }  
    
    public static long fact(int num){
        if(num<2){
            return 1;
        }
        long factorial = 1;
        int i = 2;
        while (i <= num) {
            factorial *= i;
            i++;
        }
        return factorial;
    }
}
