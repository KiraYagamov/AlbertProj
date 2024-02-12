package Lesson10;

public class Puma extends Cat {
    public Puma(){
        size = 5;
        color = "Black";
    }
    @Override
    public void purr() {
        System.out.println("РАРАРАРРА");
    }
}
