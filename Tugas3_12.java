import java.util.Scanner;

public class Tugas3_12 {
    public static void main(String[] args) {
        Scanner Input12 = new Scanner(System.in);

        String[] menu = {
            "Tahu Telor", "Nasi Ayam Goreng", "Nasi Goreng Jawa", "Indomie", "Indomie + telur", "Nasi Bungkus", "Gorengan", 
            "Kopi Hitam", "Kopi Susu", "Vietnam Drip", "Wedang Uwuh", "Teh Manis", "Teh Tawar", "Es Sirup", "Air Mineral"
        };

        String search;
        int hasil = 0;
        boolean ditemukan = false;

        System.out.println("==========Daftar Menu==========");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        System.out.print("Masukkan Makanan/Minuman Yang Dicari: ");
        search = Input12.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (search.equalsIgnoreCase(menu[i])) {
                hasil = i + 1;
                ditemukan = true;
                break;
            }
        }

        System.out.println();
        if (ditemukan) {
            System.out.println(search + " Tersedia di Menu " + hasil + ".");
        } else {
            System.out.println(search + " Tidak Ditemukan Pada Menu.");        
        }
        System.out.println();


    }
}