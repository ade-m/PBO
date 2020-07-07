package app.Model;

public class NonCoffee extends Minuman{

    public NonCoffee(String namaMinuman,String Keterangan) {
        super(namaMinuman, Keterangan);
    }

   
    @Override
    public String toString() {
        return super.getNamaMinuman() +"\n" + super.getKeterangan();
    }

}