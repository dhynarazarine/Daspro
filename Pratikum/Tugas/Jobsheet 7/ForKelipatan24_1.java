import java.util.Scanner;

public class ForKelipatan24_1 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int kelipatan;
        int total = 0; 
        int counter = 0;
        double average = 0.0;

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
        }
        if (counter > 0){
            average = (double) total / counter;
        }
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan,counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan,total);
        System.out.printf("Rata - rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan,average);
    }
}