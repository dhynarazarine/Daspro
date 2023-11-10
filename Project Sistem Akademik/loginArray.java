import java.util.Scanner;

public class loginArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] user = new String[][] {
            {"Admin", "Admin123"},
            {"Dosen", "Dosen456"},
            {"Mahasiswa", "Mahasiswa789"}
        };

        boolean isLoggedIn = true;

        System.out.print("Masukkan username: ");
        String username = sc.nextLine();
        System.out.print("Masukkan password: ");
        String password = sc.nextLine();

        boolean valid = false;
        for (int i = 0; i < user.length; i++) {
            if (user[i][0].equals(username) && user[i][1].equals(password)) {
            valid = true;
            System.out.println("Login Berhasil");
            break;
        } else {
            System.out.println("Login gagal. Username atau password salah");
            break;
        }
    }
    }
}