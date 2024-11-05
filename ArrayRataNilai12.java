import java.util.Scanner;

public class ArrayRataNilai12 {
   public static void main(String[] args) {
        
    Scanner Input12 = new Scanner(System.in);

    int[] nilaiMhs = new int [10];
    int i;
    double total = 0, rata2;
    
    for (i = 0; i < nilaiMhs.length; i++){
        System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            nilaiMhs[i] = Input12.nextInt();
    }
        for (i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];
        }

            rata2 = total / nilaiMhs.length;
                System.out.println("Rata-Rata Nilai = " + rata2);           
   }
}