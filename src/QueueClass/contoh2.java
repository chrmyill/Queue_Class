package QueueClass;

import java.util.LinkedList;
import java.util.Queue;

public class contoh2 {
    public static void main(String[] args) {
        // Membuat objek Queue dengan LinkedList
        Queue<String> queue = new LinkedList<>();

        // Menambahkan elemen ke dalam antrian
        queue.add("Elemen 1");
        queue.add("Elemen 2");
        queue.add("Elemen 3");

        // Menampilkan elemen-elemen dalam antrian
        System.out.println("Elemen-elemen dalam antrian: " + queue);

        // Menghapus dan mengembalikan elemen pertama dari antrian
        String firstElement = queue.remove();
        System.out.println("Elemen pertama yang dihapus: " + firstElement);

        // Mengambil elemen pertama tanpa menghapusnya
        String peekElement = queue.peek();
        System.out.println("Elemen pertama tanpa dihapus: " + peekElement);

        // Cetak jumlah elemen dalam antrian
        int size = queue.size();
        System.out.println("Jumlah elemen dalam antrian: " + size);
    }
}
