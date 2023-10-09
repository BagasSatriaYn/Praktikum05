import java.util.Scanner;

public class PemilihanBilangan07{
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = input07.nextInt();

        String hasil;
        hasil = (angka > 0.0 ) ? "Bilangan Positif" : "Bilangan ";
        System.out.println(angka+ " adalah " + hasil );
         }
    }

