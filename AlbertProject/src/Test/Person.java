package Test;

public class Person {

    private String name;

    private float height;

    public Person(String name, float height){
        setName(name);
        setHeight(height);
    }
    public Person(){
        name = "Default";
        height = 1.7f;
    }
    public Person(String name){
        this.name = name;
        height = 1.7f;
    }
    public Person(float height){
        name = "Default";
        this.height = height;
    }

    public String getName(){      //геттер
        return name;
    }

    public void setName(String name) {      //сеттер
        if(!name.isEmpty()){
            this.name = name;
        }
        else{
            this.name = "Default";
        }
    }

    public void setName() {      //сеттер
        this.name = "Default";
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height){
        if(height > 0){
            this.height = height;
        }
        else{
            this.height = 1.7f;
        }
    }

    public void sayHello(){
        System.out.println(name + " сказал \"Привет!\"");
    }

    public void sayHello(String any){
        if(any.isEmpty()){
            return;
        }
        System.out.println(name + " сказал " + any);
    }

    public void getData(){
        System.out.println("Имя: " + name);
        System.out.println("Рост: " + height + " метров");
    }
}