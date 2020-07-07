package app.Model;

public class Makanan {
    private String namaMakanan;
    private String Keterangan;

    public Makanan(String namaMakanan, String Keterangan) {
        this.namaMakanan = namaMakanan;
        this.Keterangan = Keterangan;
    }

    public String getNamaMakanan() {
        return this.namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public String getKeterangan() {
        return this.Keterangan;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

}