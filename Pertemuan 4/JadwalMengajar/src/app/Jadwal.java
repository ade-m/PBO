package app;

public class Jadwal {
    private Dosen Dosenmk;
    private Matakuliah Mkul;
    private String Jammulai,Jamakhir;

    public Jadwal(Dosen Dosenmk, Matakuliah Mkul, String Jammulai, String Jamakhir) {
        this.Dosenmk = Dosenmk;
        this.Mkul = Mkul;
        this.Jammulai = Jammulai;
        this.Jamakhir = Jamakhir;
    }

    public Dosen getDosenmk() {
        return this.Dosenmk;
    }

    public void setDosenmk(Dosen Dosenmk) {
        this.Dosenmk = Dosenmk;
    }

    public Matakuliah getMkul() {
        return this.Mkul;
    }

    public void setMkul(Matakuliah Mkul) {
        this.Mkul = Mkul;
    }

    public String getJammulai() {
        return this.Jammulai;
    }

    public void setJammulai(String Jammulai) {
        this.Jammulai = Jammulai;
    }

    public String getJamakhir() {
        return this.Jamakhir;
    }

    public void setJamakhir(String Jamakhir) {
        this.Jamakhir = Jamakhir;
    }

}