import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr ={3,2,54,7,8,96,14,25,63,69,86,49,57,89,65,32,36,58,12,37,14,45};
        System.out.println("Welcome to Array Searching");
        System.out.print("Enter the number you want to search : ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if(isFound){
            System.out.println("Your Number is found in the Array");
        }
        else{
            System.out.println("Your Number is Not found in the Array");
        }
    }


public static boolean isFound(int[] arr, int num){
int index = 0;
while (index < arr.length) {
    if(arr[index] == num)
    return true;
    index++;
}
    return false;
}

}
