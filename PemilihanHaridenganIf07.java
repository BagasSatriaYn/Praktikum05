import java.util.Scanner;

public class PemilihanHaridenganIf07{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka (1-7): ");
        int angka = input.nextInt();
        
        if (angka >= 1 && angka <= 5) {
            System.out.println("Weekday");
        } else if (angka == 6 || angka == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }

        input.close();
    }
}
