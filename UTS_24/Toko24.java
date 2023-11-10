import java.util.Scanner;

public class Toko24 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Toko");
        System.out.print("Masukkan nama Anda: ");
        String namaPelanggan = scanner.nextLine();

        boolean Member = false;
        double totalhargasebelumdiskon = 0;
        double totalDiskon = 0;
        int totalitemBarang = 0;

        while (true) {

            System.out.print("Masukkan nama produk yang Anda beli: ");
            String namaProduk = scanner.next();
            System.out.print("Banyaknya: ");
            int kuantitas = scanner.nextInt();
            System.out.print("Harga: ");
            double hargaSatuan = scanner.nextDouble();
            System.out.print("Diskon (%): ");
            String adaDiskon = scanner.next();
            double diskon = 0;

            if (adaDiskon.equalsIgnoreCase("Y")) {
                System.out.print("Masukkan persentase diskon: ");
                double persentaseDiskon = scanner.nextDouble();
                diskon = hargaSatuan * persentaseDiskon / 100;
            }

            double totalHargaProduk = (hargaSatuan - diskon) * kuantitas;
            totalhargasebelumdiskon += totalHargaProduk;
            totalDiskon += diskon;
            totalitemBarang += kuantitas;

            System.out.print("Apakah Anda ingin menambahkan produk lagi (Y/N)? ");
            String tambahProduk = scanner.next();
            if (!tambahProduk.equalsIgnoreCase("y")) {
             System.out.print("Apakah Anda member (Y/N)? ");
            String memberStatus = scanner.next();
            if (memberStatus.equalsIgnoreCase("Y")) {
                Member = true;
            }
                break;
            }
        }

        
        if (Member && totalhargasebelumdiskon >= 200000) {
            totalDiskon += 0.1 * totalhargasebelumdiskon;
        } else if (Member) {
            totalDiskon += 0.05 * totalhargasebelumdiskon;
        }


        double totalAkhir = totalhargasebelumdiskon - totalDiskon;

        System.out.println("----------Total Pembelian----------");
        System.out.println("Nama Pelanggan                  = " + namaPelanggan);
        System.out.println("Tipe                            = " + (Member ? "Member" : "Bukan Member"));
        System.out.println("Total Item Barang yang dibeli   = " + totalitemBarang);
        System.out.println("SubTotal                        = " + totalhargasebelumdiskon);
        System.out.println("Total Diskon                    = " + totalDiskon);
        System.out.println("Total yang harus dibayar        = " + totalAkhir);
    }
}