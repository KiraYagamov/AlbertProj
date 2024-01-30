package SeaBattleD;

public class Field {
    int length;
    int shipLen;
    int[] field;
    public Field(int length, int shipLen){
        this.length = length;
        this.shipLen = shipLen;
        field = new int[length];
    }

    public void generateField(){
        int index = (int) (Math.random() * (length - 3));
        for (int i = 0; i < length; i++) {
            field[i] = 0;
        }
        for (int i = index; i < index + shipLen; i++) {
            field[i] = 1;
        }
    }

    public boolean push(int pos){
        return field[pos] == 1;
    }

    public void kill(int pos){
        if(push(pos)) field[pos] = 3;
        else field[pos] = 2;
    }
    public boolean checkField(){
        boolean have = false;
        for(int i : field){
            if(i == 1){
                have = true;
                break;
            }
        }
        return have;
    }
    public void displayField(){
        for(int i : field){
            if(i == 1){
                System.out.print("0 ");
            }
            else{
                System.out.print(i + " ");
            }
        }
    }
}