package Lesson5;

public class Functions {

    String data = "Hello world!";
    int num = 10;

    public static void main(String[] args) {
        Functions functions = new Functions();

        int sum = functions.plus(functions.num, 7);

        System.out.println(sum);
    }

    public void hello(){
        System.out.println(data);
    }

    int plus(int a, int b){
        hello();
        return a + b;
    }
}