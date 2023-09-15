import java.math.BigDecimal;
import java.util.Scanner;

public class space_boxing {
    public static void main(String[] args){
        System.out.print("Please enter your current earth weight: ");
        Scanner scanner = new Scanner(System.in);
        int weight = scanner.nextInt();
        System.out.println("I have information for the following planets: ");
        System.out.println("1. Venus    2. Mars    3. Jupiter");
        System.out.println("4. Saturn   5. Uranus  6. Neptune");
        System.out.print("Which planet are you visiting? ");
        int planet = scanner.nextInt();
        if(planet == 1)
            System.out.println("Your weight would be "+round(weight*0.78)+" pounds on that planet. ");
        else if(planet == 2)
            System.out.println("Your weight would be "+round(weight*0.39)+" pounds on that planet. ");
        else if(planet == 3)
            System.out.println("Your weight would be "+round(weight*2.65)+" pounds on that planet. ");
        else if(planet == 4)
            System.out.println("Your weight would be "+round(weight*1.17)+" pounds on that planet. ");
        else if(planet == 5)
            System.out.println("Your weight would be "+round(weight*1.05)+" pounds on that planet. ");
        else if(planet == 6)
            System.out.println("Your weight would be "+round(weight*1.23)+" pounds on that planet. ");
        else
            System.out.println("Please enter a valid number. ");


    }
    public static double round(double d){
        BigDecimal b = new BigDecimal(d);
        double f = b.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
        return f;
    }

}
