import java.util.Scanner;

public class PemilihanHaridenganIf07{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai: ");
        int nilai = input.nextInt();
        
        if (nilai >= 70) {
            System.out.println("Anda tidak perlu remidi");
        } else {
            System.out.println("Anda perlu remidi");
        }

        input.close();
    }
}
