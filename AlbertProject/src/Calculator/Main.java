package Calculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        while (true) {
            String input = scanner.nextLine();
            if(!input.equals("Stop")) System.out.println(main.calculate(input));
            else break;
        }
    }
    private String calculate(String input){
        try {
            String[] data = input.split(" ");
            if (data.length != 3) return "Error!";
            double num1 = Double.parseDouble(data[0]);
            double num2 = Double.parseDouble(data[2]);
            switch (data[1]) {
                case "+": return String.valueOf(num1 + num2);
                case "-": return String.valueOf(num1 - num2);
                case "*": return String.valueOf(num1 * num2);
                case "/": return String.valueOf(num1 / num2);
                case "^": return String.valueOf(Math.pow(num1, num2));
                default: return "Error!";
            }
        }
        catch (Exception e){return "Error!";}
    }
}