public class JmlDeret24 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 25; i >= 1; i--){
            total += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.printf("Hasil penjumlahan deret bilangan 25 sampai dengan 1 adalah: %d\n", total);
        }
    }