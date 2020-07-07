package app;

public class App {
    public static void main(String[] args) throws Exception {
       Box integerBox = new Box();

       integerBox.add("10");
       System.out.println(integerBox.toString());
       integerBox.add(20);
       
       System.out.println(integerBox.toString());
    }
}