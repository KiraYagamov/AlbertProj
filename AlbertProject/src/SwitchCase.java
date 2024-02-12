import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        switch (str){
            case "1": System.out.println("Один"); break;
            case "2": System.out.println("Два"); break;
            case "3": System.out.println("Три"); break;
            default: System.out.println("Больше трёх");
        }
    }
}
