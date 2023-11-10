
public class Kasus24 {
    public static void main(String[] args) {
        int N = 5;

        for (int i = 1; i <= N; i++){
            for (int k = 1; k < i; k++){
                System.out.print(" ");
            }
            for (int j = i; j <= N; j++){
                System.out.print(j + "");
            }
            System.out.println();
        }
    }
}