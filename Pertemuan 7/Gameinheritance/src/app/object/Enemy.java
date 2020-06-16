package app.object;

public class Enemy {
    private String name;
    private int hp,attackPoin;
    public Enemy(){
        hp=100;
    }
    public void attack(){
        System.out.println("menyerang player");
    }
    public void cekHP(){
        System.out.println("HP :"+getHp());
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

    public int getAttackPoin() {
        return this.attackPoin;
    }

    public void setAttackPoin(int attackPoin) {
        this.attackPoin = attackPoin;
    }

}