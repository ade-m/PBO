package app.Model;

public class Coffee extends Minuman{


    public Coffee(String namaMinuman,String Keterangan) {
        super(namaMinuman, Keterangan);
    }


    @Override
    public String toString() {
        return super.getNamaMinuman() +"\n" + super.getKeterangan();
    }

}