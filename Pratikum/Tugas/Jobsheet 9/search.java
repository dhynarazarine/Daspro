import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] matkul = {"CTPS", "Agama", "Bing", "Daspro", "PAMB"};
        int [] arrayMatkul = {1,2,3,4,5};
        int keyMatkul = 0;
        int jml = 0;
        int hasil = 0;

        System.out.print("Masukkan jumlah mata kuliah: ");
        jml = sc.nextInt();

        for (int i = 0; i < jml; i++) {
            System.out.print("Masukkan matkul ke-"+i+" : ");
            matkul[i] = sc.next();
        }
        System.out.print("Masukkan Matkul yang ingin dicari: ");
        keyMatkul = sc.nextInt();
        for (int i = 0; i < jml; i++){
            if (arrayMatkul[i] == keyMatkul) {
                hasil = i;
                System.out.println("Matkul ada di posisi indeks ke-"+i);
                break;
            }
        }
        }
        
    }
