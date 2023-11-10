import java.util.Scanner;

public class IfKondisi24 {
    public static void main(String[] args) {
        Scanner sc24 = new Scanner(System.in);
        System.out.println("Masukkan Suhu : ");
        int suhu = sc24.nextInt();
        if (suhu<16) {
            System.out.println("silahkan menggunakan jaket");
        }
        if (suhu<20) {
            System.out.println("silahkan pakai baju tebal");
        }
        else{
            System.out.println("silahkan pakai topi");
        }
        
    }
}