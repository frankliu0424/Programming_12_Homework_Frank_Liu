import java.util.Scanner;

public class how_old {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Hey What's your name? ");
        String name = input.next();
        System.out.print("OK, "+ name +", how old are you? ");
        int age = input.nextInt();
        if(age > 0 && age < 16)
            System.out.println("You can't drive. ");
        else if(age == 16 || age == 17)
            System.out.println("You can drive but not vote. ");
        else if(age >= 18 && age <= 24)
            System.out.println("You can vote but not rent a car. ");
        else if(age >= 25 && age <= 150)
            System.out.println("You can do pretty much anything. ");
        else
            System.out.println("Please enter a valid age. ");
    }
}
