import java.util.Scanner;
public class Ucapan_24 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        //ditambahkan statement System.out.println di dalam fungsi dengan nilai kembalian
        //System.out.print("Ucapan diterima untuk " + namaOrang);
        sc.close();
        return namaOrang;
    }    
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println(" Thank you "+nama+"\nMay the force be with you ");
    }
    
}
