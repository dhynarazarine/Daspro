import java.util.Scanner;

public class PemilihanPercobaan224 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        System.out.println("Nilai uas   : ");
        float uas = input24.nextFloat();
        System.out.println("Nilai uts   : ");
        float uts = input24.nextFloat();
        System.out.println("Nilai kuis   : ");
        float kuis = input24.nextFloat();
        System.out.println("Nilai tugas   : ");
        float tugas = input24.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F); 
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);

    }
}