package Lesson9;

public class Builder extends Driver {
    public Builder(int ex){
        super(ex);
        this.name = "Builder";
    }
    public void build(){
        System.out.println("Build");
        experience += 1;
    }
}
