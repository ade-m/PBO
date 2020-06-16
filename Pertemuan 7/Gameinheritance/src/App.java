
import app.object.Burung;
import app.object.Pocong;
import app.object.Zombie;


public class App {
    public static void main(String[] args) throws Exception {
        Pocong a = new Pocong();
        Burung b = new Burung();
        Zombie c = new Zombie();
        a.cekHP();
        a.attack();
        b.attack();
        c.attack();
        a.jump();
        b.fly();
        c.walk();
    }
}