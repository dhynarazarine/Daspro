import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Scanner input = new Scanner(System.in); //ada 2 scanner karena ada menu master dan pilihan menu
        String [][] user = new String[][] {
            {"Admin", "Admin123"},
            {"Dosen", "Dosen456"},
            {"Mahasiswa", "Mahasiswa789"}
        };
        
        System.out.println("==========================\n");
        System.out.println("SELAMAT DATANG DI SIAKAD!");
        System.out.println("\n==========================");
        System.out.println("Silahkan Login Terlebih dahulu!\n");
        System.out.print("Masukkan Username : ");
        String username = sc.nextLine();
        System.out.print("Masukkan Password : ");
        String password = sc.nextLine();

        boolean isLoggedIn = false;
        boolean isLoggedAdmin = false;
        boolean isLoggedDosen = false;
        boolean isLoggedMahasiswa = false;

        for (int i = 0; i < user.length; i++) {
            if (user[0][0].equals(username) && user[0][1].equals(password)) {
                isLoggedAdmin = true;
                break;
            } else if (user[1][0].equals(username) && user[1][1].equals(password)) {
                isLoggedDosen = true;
                break;
            } else if (user[2][0].equals(username) && user[2][1].equals(password)) {
                isLoggedMahasiswa = true;
                break;
            }
        }

        if (!isLoggedIn) { //dikasih not supaya program isLoggedIn bernilai trua dan program dapat berjalan
            while (true) {
                if (isLoggedAdmin) {
                    System.out.println("====================\n");
                    System.out.println("INI HALAMAN ADMIN");
                    System.out.println("\n====================");
                    System.out.println("Pilihan Menu : ");
                    System.out.println("1. Input Data Mahasiswa");
                    System.out.println("2. Input Matkul");
                    System.out.println("3. Cetak KHS");
                    System.out.print("Menu yang anda pilih : ");
                    int inputMenu = sc.nextInt();
                    
                    break;
                
                } else if (isLoggedDosen) {
                    System.out.println("====================\n");
                    System.out.println("INI HALAMAN DOSEN");
                    System.out.println("\n====================");
                    System.out.println("Pilihan Menu : ");
                    System.out.println("1. Input Nilai");
                    //System.out.println("2. Pelaporan Nilai");
                    System.out.print("Menu yang anda pilih : ");
                    int inputMenu = sc.nextInt();
                    switch (inputMenu) {
                        case 1: 
                        String [] matkul = {"CTPS", "PRAKDASPRO", "PAMB", "MTKDAS", "KTI", "DASPRO", "BING", "BINDO", "AGAMA"};
                        String [] find = new String[7];
        
                        String hasil = " ";

                        System.out.print("Masukkan matkul yang ingin Diinput nilai: ");
                        String Inpmatkul=  sc.next();
        
                        boolean findd = false;
                            for (int i = 0; i < matkul.length; i++) {
                                if ( matkul[i].equalsIgnoreCase(Inpmatkul)) {
                                    findd = true;
                                    hasil = matkul[i];
                                    break;   
                                    }
                            }
                        if (findd) {
                            System.out.println("Matkul yang ingin diinput nilai ditemukan");
                        }else {
                            System.out.println("Matkul tidak ditemukan");
                        }
                        System.out.println("===============================================");

                        int[][] inputNilai = new int [4][2];
                        for (int i = 0; i < inputNilai.length; i++){
                            System.out.println("Menginput nilai untuk mahasiswa ke-" + (i+1));

                            String[] namaMahasiswa = new String[4];
                            
                            System.out.print("Masukkan nama mahasiswa: ");
                            String nama = sc.next();
                        
                            System.out.print("Masukkan Nilai ke-1: ");
                            inputNilai[i][0] = sc.nextInt();

                            System.out.print("Masukkan Nilai ke-2: ");
                            inputNilai[i][1] = sc.nextInt();
                        }
                            
        
                        case 2:
                            // ini pelaporan nilai
                            break;
                   
         

                    default:
                    }
                } else if (isLoggedMahasiswa) {
                    System.out.println("====================\n");
                    System.out.println("INI HALAMAN MAHASISWA");
                    System.out.println("\n====================");
                    System.out.println("Pilihan Menu : ");
                    System.out.println("1. Update data mahasiswa");
                    System.out.println("2. Cetak KHS dan Nilai");
                    System.out.println("3. Searching Matkul");
                    System.out.print("Menu yang anda pilih : ");
                    int inputMenu = sc.nextInt();

                    switch (inputMenu) {
                        case 1: 
                            // ini update data
                            break;
                        case 2:
                            // ini cetak khs dan nilai
                            break;
                        case 3:
                        String [] matkul = {"CTPS", "PRAKDASPRO", "PAMB", "MTKDAS", "KTI", "DASPRO", "BING", "BINDO", "AGAMA"};
                        String [] find = new String[7];
                        String [] hari = new  String [7];
                            
                        hari[0] = "Senin";
                        hari[1] = "Selasa";
                        hari[2] = "Rabu";
                        hari[3] = "Kamis";
                        hari[4] = "Jum'at";
                        hari[5] = "Sabtu";
                        hari[6] = "Minggu";
                        String hasil = " ";
            
            
                        System.out.println("Matkul anda adalah sebagai berikut : ");
                        for (int i = 0; i < matkul.length; i++) {
                            System.out.println(matkul[i]);
                        }
                        
                        System.out.print("Masukkan matkul yang ingin dicari : ");
                        String Inpmatkul=  input.nextLine();
                
                        boolean findd = false;
                        for (int i = 0; i < matkul.length; i++) {
                            if ( matkul[i].equals(Inpmatkul)) {
                                findd = true;
                                hasil = matkul[i] = hari[i];
                                break;   
                            }
                        }

                        if (findd) {
                            System.out.println("Matkul yang anda cari ada di hari: " + hasil );
                        }else {
                            System.out.println("Matkul tidak ditemukan");
                        }
                        break;

                    default:
                    }
                    System.out.println("Apakah anda ingin memilih menu lain? (y/t)");
                    char ulang = sc.next().charAt(0);
                    if (ulang == 't') {
                        System.out.println("Anda telah log out");
                        break;
                    }
                }
            }
        } else {
            System.out.println("Login Gagal! Periksa kembali username dan password anda");
        }
    }
}
