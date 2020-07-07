package app.Model;

public class Dessert extends Makanan{

        public Dessert(String namaMakanan,String Keterangan) {
            super(namaMakanan, Keterangan);
        }


    @Override
    public String toString() {
        return super.getNamaMakanan() +"\n" + super.getKeterangan();
    }
}