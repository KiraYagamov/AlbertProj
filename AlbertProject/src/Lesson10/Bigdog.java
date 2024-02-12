package Lesson10;

public class Bigdog extends Dog {
    public Bigdog(){
        size = 4;
        volume = 5;
    }

    @Override
    public void bark() {
        System.out.println("ГАВ!");
    }
}