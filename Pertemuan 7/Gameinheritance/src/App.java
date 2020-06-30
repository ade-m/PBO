
//import app.object.Burung;
import app.object.Pocong;
import app.object.Zombie;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
//import java.util.ListIterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class App {


    public static void main(String[] args) throws Exception {
        // Pocong a = new Pocong();
        // Burung b = new Burung();
        // Zombie c = new Zombie();
        // a.cekHP();
        // a.attack();
        // b.attack();
        // c.attack();
        // a.jump();
        // b.fly();
        // c.walk();
        // Enemy[] enemies = {new Pocong(),new Burung(),new Zombie()};
        // test(enemies[0]);
        // test(enemies[1]);
        // test(enemies[2]);
        // Enemy test = new Enemy();
        //List <Pocong> Pocongs = new ArrayList();
        // testArraylist();
        // testStack();
        testHasSet();
        
    }
    public static void testHasSet(){
        HashSet<Zombie> zombies= new HashSet<Zombie>();
        zombies.add(new Zombie("Toni", 90));
        zombies.add(new Zombie("Jhon", 50));
        zombies.add(new Zombie("Black", 99));
        if(!zombies.isEmpty()) tampilData(zombies);
        
    }
    public static void testStack(){
        Stack<Zombie> zombies = new Stack<Zombie>();
        zombies.push(new Zombie("Toni",90));
        zombies.add(new Zombie("Susi",80));
        zombies.add(new Zombie("Rosa",99));
        System.out.println("Data pertama");
        tampilData(zombies);
        zombies.pop();
        System.out.println("Data kedua");
        tampilData(zombies);

    }
    public static void testArraylist(){
        ArrayList<Zombie> zombies = new ArrayList<Zombie>();
        Zombie c = new Zombie("Budi",90);
        zombies.add(new Zombie("Toni",90));
        zombies.add(c);
        tampilData(zombies);
        zombies.remove(c);
        tampilData(zombies);
    }
    public static void tampilData(ArrayList<Zombie> zombie){
        Iterator itr2= zombie.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
    public static void tampilData(Stack<Zombie> zombie){
        Iterator itr2= zombie.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
    public static void tampilData(HashSet<Zombie> zombie){
        Iterator itr2= zombie.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}