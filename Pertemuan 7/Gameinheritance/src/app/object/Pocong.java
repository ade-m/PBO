package app.object;

public class Pocong extends Enemy implements Enemyss{

    public void jump(){
        System.out.println("Pocong Lompat");
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
    public void attackArea(){
        System.out.println("Menyerang area . . .");      
    }

}