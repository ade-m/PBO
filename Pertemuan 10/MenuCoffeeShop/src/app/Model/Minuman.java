package app.Model;

public class Minuman {
    private String namaMinuman;
    private String Keterangan;


    public Minuman(String namaMinuman, String Keterangan) {
        this.namaMinuman = namaMinuman;
        this.Keterangan = Keterangan;
    }

    public String getNamaMinuman() {
        return this.namaMinuman;
    }

    public void setNamaMinuman(String namaMinuman) {
        this.namaMinuman = namaMinuman;
    }

    public String getKeterangan() {
        return this.Keterangan;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

}