// example of function/method
public class Function {
    public static void main(String[] args) {
        greetUser(); // calling method in main method
        pattern();  // calling pattern method in main method
    }
    
    public static void greetUser(){
        System.out.println("Hello From Arpit");
    }

    public static void pattern(){
        int rows = 0;
        while (rows < 20) {
            System.out.print("*  ");
            int i = 0;
            while (i < rows) {
                System.out.print("*  ");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

}
