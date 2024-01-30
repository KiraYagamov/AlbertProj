package SeaBattleD;

public class Starter {
    public static void main(String[] args) {
        GameController gameController = new GameController(10, 4);
        gameController.startGame();
    }
}