import java.util.Scanner;

public class PemilihanPercobaan224_1 {
    public static void main(String[] args) {
        Scanner input24_1 = new Scanner(System.in);
        String nilai_huruf;
        System.out.println("Nilai uas   : ");
        float uas = input24_1.nextFloat();
        System.out.println("Nilai uts   : ");
        float uts = input24_1.nextFloat();
        System.out.println("Nilai kuis   : ");
        float kuis = input24_1.nextFloat();
        System.out.println("Nilai tugas   : ");
        float tugas = input24_1.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F); 

        String message = total < 65 ? "Remidi" : "Tidak remidi";

        System.out.println("Nilai akhir = " + total + " sehingga " + message);

        if (total>80){
            nilai_huruf="A";
        }else if (total>73){
            nilai_huruf="B+";
        }else if (total>65){
            nilai_huruf="B";
        }else if (total>60){
            nilai_huruf="C+";
        }else if (total>50){
            nilai_huruf="C";
        }else if (total>39){
            nilai_huruf="D";
        }else {
            nilai_huruf="E";
        }

        System.out.println("Kamu mendapatkan Grading akhir yaitu : " + nilai_huruf);

    }
}