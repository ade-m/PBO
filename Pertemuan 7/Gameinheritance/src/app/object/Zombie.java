package app.object;

public class Zombie extends Enemy{
    private String name;
    private int hp;
    public Zombie(String name,int hp){
        this.name=name;
        this.hp=hp;
    }
    public void walk(){
        System.out.println("Zombie Jalan");
    }
    @Override
    public void attack(){
      System.out.println("Menyerang");
    }
    @Override
    public void move(){
        System.out.println("Bergerak . . .");
    }
    @Override
    public void cekHP(){
        System.out.println("HP : "+ super.getHp());
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", hp='" + getHp() + "'" +
            "}";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    
}