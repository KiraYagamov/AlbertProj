package Lesson10;

public abstract class Cat extends Animal {
    String color;

    public Cat(){
        type = "Cat";
    }

    public abstract void purr();

    public String getColor(){
        return color;
    }
}