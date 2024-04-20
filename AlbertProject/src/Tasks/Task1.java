package Tasks;

public class Task1 {
    public static void main(String[] args) {
        double num = Math.pow(8, 2020) + Math.pow(4, 2017) + 26 - 1;
        long n = Double.doubleToLongBits(num);
        int count = 0;
        String bin = Long.toBinaryString(n);
        for (int i = 0; i < bin.length(); i++) {
            if(bin.charAt(i) == '1'){
                count++;
            }
        }
        System.out.println(count);
    }
}
