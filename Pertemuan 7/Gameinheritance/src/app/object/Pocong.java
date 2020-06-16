package app.object;

public class Pocong extends Enemy{

    public void jump(){
        System.out.println("Pocong Lompat");
    }
    @Override
    public void attack(){
        super.attack();
        this.setHp(this.getHp()-1);
        this.cekHP();
    }
}