package Lesson10;

public class Smalldog extends Dog {
    public Smalldog(){
        size = 2;
        volume = 3;
    }

    @Override
    public void bark() {
        System.out.println("Вуф");
    }
}