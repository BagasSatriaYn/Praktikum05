import java.util.Scanner;

public class TugasKelompok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai = ");

        int MasukkanNilai = input.nextInt();
        System.out.println("Minimal KKM = 70 ");

        if(MasukkanNilai >= 70){
            System.out.println("Anda tidak perlu remidi");
    
        }
        
        else 
            System.out.println("Anda Perlu remidi");
        }
    }
         

    