package app.Model;

public class MiniBites extends Makanan{

    public MiniBites(String namaMakanan,String Keterangan) {
        super(namaMakanan, Keterangan);
    }


    @Override
    public String toString() {
        return super.getNamaMakanan() +"\n" + super.getKeterangan();
    }
}