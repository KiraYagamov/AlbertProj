package Lesson9;

public class Driver extends Person {
    protected int experience;

    public Driver(int experience) {
        this.experience = experience;
        this.name = "Driver";
    }
    protected void drive(){
        System.out.println("Drive");
    }
}