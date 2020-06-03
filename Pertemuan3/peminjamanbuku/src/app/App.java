package app;
import java.util.ArrayList;

import app.Buku;
import app.Mahasiswa;
import app.Peminjaman;
public class App {
    public static ArrayList<Peminjaman> transaksiPinj = new ArrayList<Peminjaman>(); // tampung data peminjaman
    public static void main(String[] args) throws Exception {
        //Defini Satu mahasiswa yg bakal pinjam
        Mahasiswa x = new Mahasiswa(1098989, "JL. Sukaramai", "Budi");
        Buku pelajaran = new Buku("Java", "Alan");

        transaksiPinj.add(new Peminjaman(x, pelajaran));
        transaksiPinj.add(new Peminjaman(new Mahasiswa(1098982, "JL. Sukaramai", "Susi"), new Buku("Web", "Alan")));
        transaksiPinj.add(new Peminjaman(new Mahasiswa(1098982, "JL. Sukaramai", "Cindy"), new Buku("Java", "Susan")));

       lihatDatapeminjaman();
       transaksiPinj.remove(2);
       lihatDatapeminjaman();
    }

    public static void lihatDatapeminjaman(){
        for(int i=0;i<transaksiPinj.size();i++){ // looping => arraylist
            System.out.println("\n============\nData Peminjaman ke-"+(i+1));
            transaksiPinj.get(i).lihatDatapeminjaman(); 
        }
    }
}