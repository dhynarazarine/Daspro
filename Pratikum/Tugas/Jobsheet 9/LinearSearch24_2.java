import java.util.Scanner;

public class LinearSearch24_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] nilaiKey = new int [10];
        int jmlKey = 0;
        int hasil = 0;
        int cari = 0;
        
        System.out.print("Masukkan jumlah elemen array : ");
        jmlKey = sc.nextInt();

        for (int i = 0; i < jmlKey; i++) {
            System.out.print("Masukkan elemen array ke-"+(i+1)+" : ");
            nilaiKey[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari : ");
        cari = sc.nextInt();
        for (int i = 0; i < jmlKey; i++){
            if (nilaiKey[i] == cari){
                hasil = i;
                System.out.println("Key ada di posisi ke- " +i);
                break;
            }else{
                System.out.println("Key tidak ditemukan");
                break;
            }
        }
        sc.close();
    }
}