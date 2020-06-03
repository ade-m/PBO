package app;
/** 
* Ini Adalah Class Dosen
*
*/
public class Dosen {
    private String kddosen,nama, alamat,tgllahir;
    /** 
    * Ini Adalah Constructor Class Dosen
    *
    */
    public Dosen(String kddosen, String nama, String alamat, String tgllahir) {
        this.kddosen = kddosen;
        this.nama = nama;
        this.alamat = alamat;
        this.tgllahir = tgllahir;
    }
    public Dosen(){}
    public String getKddosen() {
        return this.kddosen;
    }

    public void setKddosen(String kddosen) {
        this.kddosen = kddosen;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTgllahir() {
        return this.tgllahir;
    }

    public void setTgllahir(String tgllahir) {
        this.tgllahir = tgllahir;
    }

    /** 
    * Ini untuk cetak data dosen
    *
    */
    @Override
    public String toString() {
        return "" +
            " Kode Dosen ='" + getKddosen() + "'" +
            "\n Nama='" + getNama() + "'" +
            "\n Alamat='" + getAlamat() + "'" +
            "\n Tgl. Lahir='" + getTgllahir() + "'" +
            "";
    }


}