import java.util.Scanner;

public class Tugas2_12 {

    public static void main(String[] args) {
        Scanner Input12 = new Scanner(System.in);

        int jumlahPesanan;
        double totalHarga = 0;

        System.out.print("Masukkan Jumlah Pesanan: ");
        jumlahPesanan = Input12.nextInt();
        Input12.nextLine();

        String[] pesanan = new String[jumlahPesanan];
        double[] harga = new double[jumlahPesanan];
        totalHarga = 0;

        for (int i = 0; i < pesanan.length; i++) {
            System.out.print("Masukkan Nama Makanan/Minuman Yang Dipesan Ke- " + (i + 1) + " : ");
            pesanan[i] = Input12.nextLine();

            System.out.print("Masukkan harga " + pesanan[i] + " : Rp. ");
            harga[i] = Input12.nextInt();
            Input12.nextLine();

            totalHarga += harga[i];
        }

        System.out.println("=======Daftar Pesanan=======");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.println((i+1) + ". " +pesanan[i]+ " = Rp. " +harga[i]);
        }
        System.out.println("Total Yang Harus Dibayar : Rp. " + totalHarga);
    }
}