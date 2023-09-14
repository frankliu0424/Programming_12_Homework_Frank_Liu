import java.util.Scanner;
import java.math.BigDecimal;

public class Hot_Dog_Stand {
    public static void main(String[] args) {
        System.out.print("How many hot dogs do you want? ");
        Scanner input = new Scanner(System.in);
        int hot_dog = input.nextInt();
        System.out.print("how many drinks do you want? ");
        int drink = input.nextInt();
        double total = (hot_dog*5.5 + drink*2)*1.12;
        System.out.println("The total price is $"+round_to_2decimals(total));
    }
    public static double round_to_2decimals(double d){
        BigDecimal b = new BigDecimal(d);
        double f = b.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
        return f;
    }
}