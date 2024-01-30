package Game;

import java.util.ArrayList;
import java.util.Calendar;

public class GameController {
    int currentNumber;
    int playerCount = 5;
    boolean gameEnded;
    ArrayList<Player> players = new ArrayList<>();
    String[] names = {"Иван", "Виктор", "Петя", "Вадим", "Артем", "Леша"};

    private void setGameRules(){
        currentNumber = (int) (Math.random() * 100 + 1);
        for (int i = 0; i < playerCount; i++) {
            players.add(new Player(i, getRandomName()));
        }
        gameEnded = false;
    }

    public void startGame(){
        setGameRules();
        while(!gameEnded){
            for (Player player : players) {
                int playerIndex = player.index;
                int pNum = player.getNum();
                player.count++;
                if(pNum == currentNumber){
                    System.out.println(player.name + " выиграл, назвав число " + pNum);
                    gameEnded = true;
                    break;
                }
                else{
                    System.out.println(player.name + " не угадал, назвав число " + pNum);
                }
            }
        }
        endGame();
    }
    private void endGame(){
        System.out.println("\n---------------------------------------------\n");
        System.out.println("Игра завершена");
        for(Player player : players){
            System.out.println(player.name + " затратил " + player.count + " попыток");
        }
    }

    private String getRandomName(){
        int index = (int) (Math.random() * names.length);
        return names[index];
    }
}