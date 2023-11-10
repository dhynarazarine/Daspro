import java.util.Scanner;

public class NilaiBersarang {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int Penghasilan;
    System.out.println("Masukkan penghasilan: ");
    Penghasilan= sc.nextInt();

    if (penghasilan >= 500000){
        System.out.println("anda masuk golongan A");
    } else if (pebghasilan >= 1000000){
        System.out.println("anda masuk golongan B");
    } else if (pebghasilan >= 2000000){
        System.out.println("anda masuk golongan C");
    } else if (pebghasilan >= 3000000){
        System.out.println("anda masuk golongan D");
    } else if (pebghasilan >= 4000000){
        System.out.println("anda masuk golongan E");
    }
}
}