import java.util.Scanner;

public class Lingkaran24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int r;
        double phi, keliling, luas;

        System.out.println("Masukkan jari jari lingkaran: ");
        r=input.nextInt();
        System.out.println("Masukkan phi: ");
        phi=input.nextDouble();
        phi=3.14;

        keliling= 2*phi*r;
        luas=phi*r*r;
        System.out.println(keliling);
        System.out.println(luas);



    }
}