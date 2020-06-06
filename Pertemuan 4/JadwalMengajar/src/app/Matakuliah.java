package app;

public class Matakuliah {
    private String kdmatkul,nmmatkul;

    public Matakuliah(String kdmatkul, String nmmatkul) {
        this.kdmatkul = kdmatkul;
        this.nmmatkul = nmmatkul;
    }
    public Matakuliah(){}
    public String getKdmatkul() {
        return this.kdmatkul;
    }

    public void setKdmatkul(String kdmatkul) {
        this.kdmatkul = kdmatkul;
    }

    public String getNmmatkul() {
        return this.nmmatkul;
    }

    public void setNmmatkul(String nmmatkul) {
        this.nmmatkul = nmmatkul;
    }

    @Override
    public String toString() {
        return "" +
            "\t Kode Matakuliah = '" + getKdmatkul() + "\n" +
            "\t Nama Matakuliah ='" + getNmmatkul() + "" +
            "";
    }

}