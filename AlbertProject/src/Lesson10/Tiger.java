package Lesson10;

public class Tiger extends Cat{
    public Tiger(){
        size = 5;
        color = "Black-orange";
    }
    @Override
    public void purr() {
        System.out.println("РРРРАРР");
    }
}