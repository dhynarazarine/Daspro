import java.util.Scanner;

public class cobalogin {
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
        String [] inputUsername = {"Admin", "Dosen", "Mahasiswa"};
        String [] inputPassword = {"Admin123", "Dosen456", "Mahasiswa789"};

        boolean found = false;
        int indexUser = -1;

        
        do {
            System.out.print("Masukkan username: ");
            String inUsername = input.nextLine();
            for (int i = 0; i < inputUsername.length; i++) {
                if (inUsername.equals(inputUsername[i])) {
                    found = true;
                    indexUser = i;
                }   
            }
            if (!found) {
                System.out.println("Pengguna tidak ditemukan");
            }
        do {
            System.out.print("Masukkan password: ");
            String inPassword = input.nextLine();
            if (inPassword.equals(inputPassword[indexUser])) {
                found = true;

            }
        }
        if (!found) {
                System.out.println("Pengguna tidak ditemukan");
        }
    }
    }
    }

        
