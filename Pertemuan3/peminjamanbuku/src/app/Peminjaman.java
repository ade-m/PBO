package app;


public class Peminjaman {
    private Buku bukuPinjam;
    private Mahasiswa anggota;

    //pinjam(Mahasiswa,buku)
    public Peminjaman(){}
    public Peminjaman(Mahasiswa anggota,Buku bukuPinjam) {
        this.bukuPinjam = bukuPinjam;
        this.anggota = anggota;
    }


    public void pinjam(Mahasiswa anggota,Buku bukuPinjam) {
        this.bukuPinjam = bukuPinjam;
        this.anggota = anggota;
    }

    //lihatDatapeminjaman
    public void lihatDatapeminjaman(){
        System.out.println("Data Peminjaman Buku :\n");
        System.out.println("Buku :\n"+bukuPinjam.toString());
        System.out.println("Mahasiswa :\n"+anggota.toString());
    }



}