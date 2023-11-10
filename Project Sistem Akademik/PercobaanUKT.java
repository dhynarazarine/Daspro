import java.util.Scanner;

public class PercobaanUKT {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int jml_ukt, lama_membayar_ukt;
        long jml_membayar_ukt;

        System.out.println("Masukkan jumlah ukt anda");
        jml_ukt = input.nextInt();
        System.out.println("Lama membayar ukt anda");
        lama_membayar_ukt = input.nextInt();
        jml_membayar_ukt=jml_ukt*lama_membayar_ukt;
        System.out.println ("Jumlah ukt yang harus dibayar anda adalah "+jml_membayar_ukt);
        

       

    

    }
}