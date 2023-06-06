package QueueClass;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AntrianBerobat {
    public static void main(String[] args) {
        Queue<String> antrian = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("--- Antrian Berobat ---");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Panggil Pasien");
            System.out.println("3. Lihat Jumlah Pasien dalam Antrian");
            System.out.println("4. Keluar Menu");
            System.out.print(  "   Pilih menu 1-4 : ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pasien: ");
                    String namaPasien = scanner.next();
                    antrian.add(namaPasien);
                    System.out.println("Pasien " + namaPasien + " ditambahkan ke antrian berobat.");
                    break;
                case 2:
                    if (antrian.isEmpty()) {
                        System.out.println("Tidak ada pasien dalam antrian.");
                    } else {
                        String pasienSelanjutnya = antrian.poll();
                        System.out.println("Panggilan untuk pasien " + pasienSelanjutnya + ".");
                    }
                    break;
                case 3:
                    System.out.println("Jumlah pasien dalam antrian berobat: " + antrian.size());
                    break;
                case 4:
                    System.out.println("Terima kasih. Program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan menu tidak valid.");
                    break;
            }
            System.out.println();
        }
    }
}
