import java.util.Scanner;

public class HargaBayar24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int harga, jumlah, jmlHal;
        double dis=0.1, total, bayar, jmlDis;
        String merk;

        System.out.println("Masukkan jumlah diskon ");
        dis=input.nextDouble();
        System.out.println("Masukkan jumlah halaman buku");
        jmlHal=input.nextInt();
        System.out.println("Masukkan nama Merk buku yang dibeli");
        merk=input.next();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli ");
        jumlah=input.nextInt();
        
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah "  +bayar);

    }
}
