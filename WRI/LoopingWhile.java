import java.util.Scanner;

public class LoopingWhile {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int number, factorial, i;
        System.out.print("Enter a number");
        number = input.nextInt();

        factorial = 1;
        i = 1;
        while (i <= number) {
            factorial = factorial * i;
            i++;
            
        }
        System.out.printf("The factorial of %d is %d\n", number, factorial);
    }
}