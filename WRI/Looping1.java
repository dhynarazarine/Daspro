import java.util.Scanner;

public class Looping1 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int number, factorial, i;
        System.out.print("Enter a number");
        number = input.nextInt();
        
        factorial = 1;
        for (i = 1; i <=number; i++) {
            factorial = factorial * i;
            
        }
        System.out.printf("The factorial of %d is %d\n", number, factorial);
    }
}