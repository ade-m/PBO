package app;
import java.util.Date;
import app.Model.Mahasiswa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        Mahasiswa abc = new Mahasiswa("1900001212", "Budi", "TI", "2019");
        abc.cetakDataUser();
        
        Mahasiswa abcd = new Mahasiswa("handoko","handoko123",new Date(),"1900001213", "Handoko", "TI", "2019");
        abcd.cetakDataUser();
    }
}