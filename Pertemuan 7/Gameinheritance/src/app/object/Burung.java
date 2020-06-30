package app.object;

public class Burung implements Enemys,Enemyss{
    int HP =10;
    
    public void fly(){
        System.out.println("Burung Terbang");
    }
    public void walk(){
        System.out.println("Burung Jalan");
    }
    public void jump(){
        System.out.println("Burung Lompat");
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
        System.out.println("HP : "+ HP);
    }

    @Override
    public void attackArea(){
        System.out.println("Menyerang Area ");
    }
}