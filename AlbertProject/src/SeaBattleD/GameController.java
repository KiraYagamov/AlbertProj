package SeaBattleD;

import java.util.Scanner;

public class GameController {
    Field field;
    final String gameName = "Морской бой 1D";

    public GameController(int length, int shipLen){
        field = new Field(length, shipLen);
    }
    public void startGame(){
        System.out.println("Начало игры \"" + gameName + "\"");
        field.generateField();
        Scanner scanner = new Scanner(System.in);
        field.displayField();
        System.out.println();
        while(field.checkField()){
            try{
                int index = Integer.parseInt(scanner.nextLine()) - 1;
                if(field.push(index)){
                    System.out.println("Попал");
                }
                else{
                    System.out.println("Не попал");
                }
                field.kill(index);
            }
            catch (NumberFormatException e){
                System.out.println("Некорректный ввод!");
            }
            catch (Exception e){
                System.out.println("Ошибка!");
            }

            field.displayField();
            System.out.println();
        }
        System.out.println("Игра завершена!");
    }
}