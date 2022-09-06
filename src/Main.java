import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[]nums = {67,74,-51,57,93,-69,-80,77,5,-24,36,-44,37,92,-28};
        boolean numer = false;
        double money = 0;
        double numbers = 0;
        for (double number : nums){
            if (number < 0){
                numer = true;
            }else {
                if (numer){
                    money += number;
                    numbers++;
                }
            }
            System.out.println(money / numbers);
            System.out.println(Arrays.toString(nums));

        }
    }
}