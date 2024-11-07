import java.util.Scanner;

public class Tugas1_12 {
    public static void main(String[] args) {
        Scanner Input12 = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
        int banyakNilai = Input12.nextInt();

        int[] nilaiMhs = new int[banyakNilai];
        int total = 0;
        double rata2;

        System.out.print("Masukkan Nilai Mahasiswa Ke-1 : ");
        nilaiMhs[0] = Input12.nextInt();
        total += nilaiMhs[0];

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        
        for (int i = 0; i < banyakNilai; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            nilaiMhs[i] = Input12.nextInt();
            total += nilaiMhs[i];

            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        rata2 = total / banyakNilai;

        System.out.println();
        System.out.println("Nilai rata-rata: " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println();

        System.out.println("=====Daftar Nilai Mahasiswa=====");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + ": " + nilaiMhs[i]);
        }
    }
}