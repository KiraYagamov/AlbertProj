package Lesson10;

public abstract class Dog extends Animal {
    int volume;
    public Dog(){
        type = "Dog";
    }

    public abstract void bark();

    public int getVolume(){
        return volume;
    }
}