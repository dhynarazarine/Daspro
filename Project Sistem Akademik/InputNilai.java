import java.util.Scanner;

public class InputNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] matkul = {"CTPS", "PRAKDASPRO", "PAMB", "MTKDAS", "KTI", "DASPRO", "BING", "BINDO", "AGAMA"};
        String [] find = new String[7];
        
        String hasil = " ";

        System.out.print("Masukkan matkul yang ingin Diinput nilai: ");
        String Inpmatkul=  sc.nextLine();
        
        boolean findd = false;
            for (int i = 0; i < matkul.length; i++) {
                if ( matkul[i].equalsIgnoreCase(Inpmatkul)) {
                    findd = true;
                    hasil = matkul[i];
                    break;   
                }
            }
        if (findd) {
            System.out.println("Matkul yang ingin diinput nilai ditemukan");
        }else {
            System.out.println("Matkul tidak ditemukan");
        }
        System.out.println("===============================================");

        int[][] inputNilai = new int [4][2];
        for (int i = 0; i < inputNilai.length; i++){
            System.out.println("Menginput nilai untuk mahasiswa ke-" + (i+1));

            String[] namaMahasiswa = new String[4];
            
            System.out.print("Masukkan nama mahasiswa: ");
            String nama = sc.next();
        
            System.out.print("Masukkan Nilai ke-1: ");
            inputNilai[i][0] = sc.nextInt();

            System.out.print("Masukkan Nilai ke-2: ");
            inputNilai[i][1] = sc.nextInt();
        }
    }
}