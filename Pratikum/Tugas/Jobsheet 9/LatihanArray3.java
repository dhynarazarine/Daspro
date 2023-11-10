import java.util.Scanner;

public class LatihanArray3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] bulan = {"Januari","Februari","Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};


        System.out.print("Masukkan angka (1- 12) : ");
        int nomorBulan =  input.nextInt();

        
        System.out.print("Nama bulan : " + bulan[nomorBulan - 1]);
    }
}