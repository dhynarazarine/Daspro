import java.util.Scanner;

public class LoginAdmin {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        String [] pengguna = {"admin", "mahasiswa", "dosen"};
        int [] password = {123, 456, 789};
        boolean login = false;

        System.out.println("Selamat Datang di SIAKAD");
        System.out.print("Masukkan username : ");
        String username = input.nextLine();
        System.out.print("Masukkan password : ");
        int pw = input.nextInt();

        for (int i = 0; i < pengguna.length; i++) {
            if (pw == password [i]) {
            login = true;
            System.out.println("Selamat berhasil login");
            break;
            } else {
                System.out.println("Invalid Password");
                break;
            }    
        }
        input.close();
    }
}