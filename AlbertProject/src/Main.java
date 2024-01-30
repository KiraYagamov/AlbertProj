import java.util.Scanner;
import Lesson5.Functions;

public class Main {
    public static void main(String[] args) {

        Functions functions = new Functions();
        functions.hello();


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String line = scanner.nextLine();
        int count = Integer.parseInt(line);

        int count3 = 0;
        int count4 = 0;
        int num = 1;

        while(count3 < count && count4 < count){
            if(num % 3 == 0 && num % 4 == 0) {
                count3++;
                count4++;
                System.out.println("Число " + num + " - делится на и 3, и на 4. " + "Номер тройки - " + count3 + ". Номер четверки - " + count4);
            }
            else if(num % 3 == 0) {
                count3++;
                System.out.println("Число " + num + " - делится на 3. " + "Номер тройки " + count3);
            }
            else if(num % 4 == 0) {
                count4++;
                System.out.println("Число " + num + " - делится на 4. " + "Номер четверки " + count4);
            }
            else {
                System.out.println("Число " + num + " - не подходит.");
            }
            num++;
        }

        if(count3 > count4){
            System.out.println("Победила тройка");
        }
        else if(count4 > count3){
            System.out.println("Победила четверка");
        }
        else{
            System.out.println("Победила дружба");
        }
    }
}