package app.object;

abstract class Enemy {
    private String name;
    private int hp=10,attackPoin;

    abstract void move();
    abstract void attack();
    abstract void cekHP();
  

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