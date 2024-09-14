// To determine the given year is leap year or not
import java.util.Scanner;
public class Test5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any year to check whether it is leap year or not : ");
        int LeapYear = input.nextInt();
        if (LeapYear % 400 == 0 || (LeapYear % 4 == 0 && LeapYear % 100 != 0)) {
            System.out.println(LeapYear + " is a Leap Year");
        }else{
            System.out.println(LeapYear + " is Not Leap Year");
        }
    }
}
