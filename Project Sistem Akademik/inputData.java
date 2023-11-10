import java.util.Scanner;

public class inputData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahMahasiwa = 6;
       
        String[][] dataMahasiswa = new String [jumlahMahasiwa][6];
        
        for (int i = 0; i < jumlahMahasiwa; i++){
            System.out.println("Masukkan data untuk mahasiswa ke-" + (i+1));
            System.out.print("Nama : ");
            dataMahasiswa[i][0] = scanner.nextLine();
            System.out.print("NIM : ");
            dataMahasiswa[i][1] = scanner.nextLine();
            System.out.print("Jurusan : ");
            dataMahasiswa[i][2] = scanner.nextLine();
            System.out.print("Prodi : ");
            dataMahasiswa[i][3] = scanner.nextLine();
        }
        System.out.println();
        System.out.println("\nData Mahasiswa: ");
        for (int i = 0; i < jumlahMahasiwa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ":");
            System.out.println("Nama: " + dataMahasiswa[i][0]);
            System.out.println("NIM: " + dataMahasiswa[i][1]);
            System.out.println("Jurusan: " + dataMahasiswa[i][2]);
            System.out.println("Prodi: "+ dataMahasiswa[i][3]);
}

        }


     

    }    

