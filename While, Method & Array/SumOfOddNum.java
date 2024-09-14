import java.util.Scanner;
public class SumOfOddNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Limit to which the sum of odd number you want to calculate : ");
        int limit = input.nextInt();
        int sum = oddSum(limit);
        System.out.println("Oddsum till "+ limit + " is " + sum);
    }

    public static int oddSum(int limit){
        int sum = 0;
        int i = 1;
        while (i<=limit) {
            sum += i;
            i +=2;
        }
        return sum;
        }
    }
