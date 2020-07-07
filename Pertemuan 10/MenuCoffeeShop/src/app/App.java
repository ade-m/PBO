package app;

import java.util.ArrayList;

import app.Model.Menu;
import app.Model.MiniBites;
import app.Model.Coffee;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=======================");
        ArrayList<Menu> menus= new ArrayList<Menu>();
        menus.add(new Menu(new MiniBites("Sandwich", "Sandwich dengan sayur segar"),10000));
        menus.add(new Menu(new Coffee("Expresso", "Single Shot"),15000));

        for(int i=0;i<menus.size();i++){
            System.out.println(menus.get(i).getT() + "\t IDR."+menus.get(i).getHarga());
        }
    }
}