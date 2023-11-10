import java.util.Scanner;

public class PemilihanPercobaan124_1 {
    public static void main(String[] args) {

        Scanner input24_1 = new Scanner(System.in);
        System.out.print("Masukkan nilai tugas: ");
        int angka = input24_1.nextInt();
        if (angka >= 80){
            System.out.println("Nilai anda A");
        }
        else if (angka <= 80){
            System.out.println("Nilai anda B");
        }
           
    }
}
