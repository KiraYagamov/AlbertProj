package Lesson10;

public class Lion extends Cat {
    public Lion(){
        size = 6;
        color = "Yellow";
    }
    @Override
    public void purr() {
        System.out.println("АРРРРР");
    }
}