import java.util.Scanner;

public class Pemilihan2Percobaan224 {
    public static void main(String[] args) {

        Scanner input24 = new Scanner(System.in);
        System.out.print("Masukkan Sudut 1 : ");
        float sudut1 = input24.nextInt();
        System.out.print("Masukkan Sudut 2 : ");
        float sudut2 = input24.nextInt();
        System.out.print("Masukkan Sudut 3 : ");
        float sudut3 = input24.nextInt();
        
        float totalsudut;
        
        totalsudut = sudut1 + sudut2 + sudut3;
    if (totalsudut == 180){
        if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
            System.out.println("Segitiga tersebut adalah segitiga siku - siku ");
        else 
            System.out.println("Segitigaa tersebut adalah bukan segitiga siku - siku");
    } else 
        System.out.println("Bukan Segitiga");
    }

}

