import java.util.Scanner;

public class LatihanIndividu224 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);
        String buku;
        int jumlahBuku,hargaBuku,total,bayar;
        double diskon  = 0;
        double diskon2 = 0;
        System.out.println("==========================================================");
        System.out.print("Masukkan jenis buku : ");
        buku = input22.next();
        System.out.print("Masukkan jumlah buku yang anda beli : ");
        jumlahBuku = input22.nextInt();
        System.out.print("Masukkan harga buku : ");
        hargaBuku = input22.nextInt();
        System.out.println("==========================================================");

        if (buku.equalsIgnoreCase("kamus")){
            if(jumlahBuku > 2){
                diskon = 0.12;
                System.out.println("Anda mendapatkan diskon sebesar 10% dan tambahan 2%");
            } else {
                diskon = 0.1;
                System.out.println("Anda mendapatkan diskon sebesar 10%");
            } 
            total = (jumlahBuku * hargaBuku);
            System.out.println("Total anda adalah : "+ total);
            diskon2 = (total * diskon);
            System.out.println("Diskon yang anda dapatkan sebesar : Rp. " +diskon2);
            bayar = (int) (total - (total *diskon));
            System.out.println("Yang harus anda bayarkan adalah : " + bayar);
            System.out.println("==========================================================");
        } else if (buku.equalsIgnoreCase("novel")){
            if(jumlahBuku > 3){
                diskon = 0.09;
                System.out.println("Anda mendapatkan diskon sebesar 7% dan tambahan 2%");
            } else if (jumlahBuku <= 3) {
                diskon = 0.08;
                System.out.println("Anda mendapatkan diskon sebesar 7% dan tambahan 1%");
            } 
            total = (jumlahBuku * hargaBuku);
            System.out.println("Total anda adalah : "+ total);
            diskon2 = (total * diskon);
            System.out.println("Diskon yang anda dapatkan sebesar : Rp. " +diskon2);
            bayar = (int) (total - (total *diskon));
            System.out.println("Yang harus anda bayarkan adalah : " + bayar);
            System.out.println("==========================================================");
        } else {
            if (jumlahBuku > 3){
                diskon = 0.05;
                System.out.println("Anda mendapatkan diskon sebesar 5%");
            } 
            total = (jumlahBuku * hargaBuku);
            System.out.println("Total anda adalah : "+ total);
            diskon2 = (total * diskon);
            System.out.println("Diskon yang anda dapatkan sebesar : Rp. " +diskon2);
            bayar = (int) (total - (total *diskon)); 
            System.out.println("Yang harus anda bayarkan adalah : " + bayar);
            System.out.println("==========================================================");
        }
    } 
}