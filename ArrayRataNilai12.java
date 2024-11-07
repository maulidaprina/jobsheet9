import java.util.Scanner;

public class ArrayRataNilai12 {
   public static void main(String[] args) {
        
    Scanner Input12 = new Scanner(System.in);

    System.out.print("Masukkan Jumlah Mahasiswa: ");
    int jumlahMhs = Input12.nextInt();

    int[] nilaiMhs = new int [jumlahMhs];
    int i, jumlahLulus = 0, jumlahTidakLulus = 0;
    double total = 0, rata2, totalLulus = 0, totalTidakLulus = 0, rata2lulus = 0, rata2TidakLulus = 0;  

    for (i = 0; i < nilaiMhs.length; i++){
        System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            nilaiMhs[i] = Input12.nextInt();
    }
        for (i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];
                if (nilaiMhs[i] > 70){
                    jumlahLulus++;
                    totalLulus += nilaiMhs[i];
                } else {
                    jumlahTidakLulus++;
                    totalTidakLulus += nilaiMhs[i];
                }
        }
            rata2 = total / nilaiMhs.length;
            rata2lulus = (jumlahLulus > 0)? totalLulus / jumlahLulus: 0;
            rata2TidakLulus = (jumlahTidakLulus > 0)? totalTidakLulus / jumlahTidakLulus: 0;

            System.out.println("Rata-Rata Seluruh Nilai Mahasiswa: " + rata2); 
            System.out.println("Jumlah Mahasiswa yang lulus: " + jumlahLulus);
            System.out.println("Rata-Rata Nilai Mahasiswa yang lulus: " + rata2lulus); 
            System.out.println("Jumlah Mahasiswa yang tidak lulus: " + jumlahTidakLulus); 
            System.out.println("Rata-Rata Nilai Mahasiswa yang tidak lulus: " + rata2TidakLulus);       
   }
}