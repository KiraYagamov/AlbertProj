package Game;

public class Player {
    int index;
    int count;
    String name;
    public Player(int index, String name){
        this.index = index;
        this.name = name;
        count = 0;
    }
    public int getNum(){
        return (int) (Math.random() * 100 + 1);
    }
}