package app;

public class Box<N> {
    private N t;
    public void add(N t){
        this.t = t;
    }
    public N get(){
        return t;
    }

    @Override
    public String toString() {
        return "{" +
            " t='" + t + "'" +
            "}";
    }

}