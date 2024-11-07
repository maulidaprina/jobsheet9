import java.util.Scanner;

public class SearchNilai12 {
    public static void main(String[] args) {
        
        Scanner Input12 = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Nilai yang Akan Diinput: ");
        int banyakNilai = Input12.nextInt();

        int[] arrNilai = new int[banyakNilai];
        int search, hasil = 0;
        boolean ditemukan = false;


        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + ( i + 1) + " : ");
            arrNilai[i] = Input12.nextInt();
        }
        
            System.out.print("Masukkan Nilai Yang Ingin Dicari: ");
            search = Input12.nextInt();

            for (int i = 0; i < arrNilai.length; i++) {
                if (search == arrNilai[i]) {
                    hasil = i+ 1;
                    ditemukan = true;
                    break;
                }
            }
        
        System.out.println();
            if (ditemukan) {
                System.out.println("Nilai " + search + " Merupakan Nilai Mahasiswa Ke-" + hasil);
            } else {
                System.out.println("Nilai yang Dicari Tidak Ditemukan");
            }

        System.out.println();
   
    }
    
}
