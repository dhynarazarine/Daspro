import java.util.Scanner;


public class PercobaanPemilihanUKT {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int jml_ukt, lama_membayar_ukt;
        long jml_membayar_ukt;
        System.out.print("Masukkan Jumlah semester yang ingin anda bayar :");
        int ukt_yang_telah_terbayar = input.nextInt();
        
        System.out.print("Masukkan jumlah ukt anda : ");
        jml_ukt = input.nextInt();
        System.out.print("Lama membayar ukt anda : ");
        lama_membayar_ukt = input.nextInt();

        jml_membayar_ukt = jml_ukt*lama_membayar_ukt;
        System.out.println("Jumlah ukt yang harus anda bayar adalah " +jml_membayar_ukt);

        if (ukt_yang_telah_terbayar >= 2){System.out.println("Jumlah Pembayaran ukt kamu "+  ukt_yang_telah_terbayar  + "anda dapat mengikuti perkuliahan");}

        else{System.out.println("Jumlah Pembayaran ukt kamu " + ukt_yang_telah_terbayar +   "Harap dibayar 2 semester" );}

    
    }
}