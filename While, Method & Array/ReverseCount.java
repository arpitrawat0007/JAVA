import java.util.Scanner;

public class ReverseCount {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Any Number from which you want to get reverse counting : ");
        int num = input.nextInt();
        while (num > 0) {
            System.out.println(num);
            num -= 1;
        }
    }
}
