package app.Model;

public class Menu<E> {
    private E t;
    private long harga;

    public Menu(E t){
        this.t=t;
    }
    public Menu(E t,long harga){
        this.t=t;
        this.harga=harga;
    }

    public E getT(){
        return t;
    }
    public long getHarga(){
        return harga;
    }
    public void setT(E t){
        this.t=t;
    }

}