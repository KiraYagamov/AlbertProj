package SeaBattleD;

import java.util.Scanner;

public class GameController {
    Field field;
    public GameController(int length, int shipLen){
        field = new Field(length, shipLen);
    }
    public void startGame(){
        field.generateField();
        Scanner scanner = new Scanner(System.in);
        field.displayField();
        System.out.println();
        while(field.checkField()){
            try{
                int index = Integer.parseInt(scanner.nextLine());
                if(field.push(index)){
                    System.out.println("Попал");
                }
                else{
                    System.out.println("Не попал");
                }
                field.kill(index);
            }
            catch (Exception e){
                System.out.println("Некорректный ввод!");
            }
            field.displayField();
            System.out.println();
        }
        System.out.println("Игра завершена!");
    }
}