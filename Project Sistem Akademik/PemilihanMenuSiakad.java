import java.util.Scanner;

public class PemilihanMenuSiakad{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Scanner input = new Scanner(System.in);
   
        int pilihan;
        char ulang;
        String [] inputUsername = {"Admin", "Dosen", "Mahasiswa"};
        String [] inputPassword = {"Admin123", "Dosen456", "Mahasiswa789"};

        boolean found = false;
        int indexUser = -1;


        do {
            System.out.println("=====Pilihan Menu=====");
            System.out.println("1. Login Akun SIAKAD");
            System.out.println("2. Update data Mahasiswa");
            System.out.println("3. Jadwal Perkuliahan");
            System.out.println("4. Input nilai Mahasiswa");
            System.out.println("5. Cetak KHS dan nilai");
            System.out.println();

            System.out.print("Pilihan Anda:");
            pilihan = sc.nextInt();
            System.out.println();
            
            
            switch (pilihan) {
                case 1:
                    System.out.println("Login Akun SIAKAD");
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
                        int trial = 0;
                        int max = 3;
                        do {
                        System.out.print("Masukkan password: ");
                            String inPassword = input.nextLine();
                            if (inPassword.equals(inputPassword[indexUser])) {
                                switch (indexUser) {
                                    case 0:
                                    System.out.println("Halaman admin");
                                    System.out.println("====================");
                                        break;
            
                                    case 1:
                                    System.out.println("Halaman mahasiswa ");                        
                                        break;
            
                                    case 2:
                                    System.out.println("Halaman dosen");
                                        break;
                                    
                                    default:
                                }        
                            }  
                        } while (trial<=max);
                    } while (!found);
                    input.close();
                    break;

                case 2:
                    System.out.println("Input data Mahasiswa");
                    break;
                case 3:
                    System.out.println("Update data Mahasiswa");
                    break;
                case 4:
                    System.out.println("Jadwal Perkuliahan");
                    break;
                case 5:
                    System.out.println("Input nilai Mahasiswa");
                    break;
                case 6:
                    System.out.println("Cetak KHS dan nilai");
                    break;
            
                default:
                    System.out.println("Maaf, Menu yang anda pilih tidak tersedia");
                    break;
        } 
        System.out.println();

        System.out.println("Apakah anda ingin memilih menu lain? (y/t)");
        ulang = sc.next().charAt(0);

        System.out.println();

        
    }
        while (ulang != 't');
        System.out.println("Terimakasih");
    }
}

