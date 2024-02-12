package Lesson10;

public class Homecat extends Cat {
    public Homecat(String color){
        size = 2;
        this.color = color;
    }

    @Override
    public void purr() {
        System.out.println("Мур");
    }
}