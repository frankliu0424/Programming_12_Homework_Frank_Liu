import java.util.Scanner;
public class little_quiz {
    public static void main(String[] args){
        int score = 0;
        int error = 0;
        //Problem 1
        System.out.println("Compute the value of 1+1. ");
        System.out.println("1.1  2.2  3.3  4.4");
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        int ans1 = scanner.nextInt();
        if(ans1 == 1)
            score++;
        else if(ans1 == 2 || ans1 == 3 || ans1 == 4)
            error++;
        else
            System.out.println("Invalid answer. ");
        //Problem 2
        System.out.println("Which of the following is not an element of Maxwell's Equations? ");
        System.out.println("1. \\frac{\\partial\\mathcal{D}}{\\partial t} \\quad & = \\quad \\nabla\\times\\mathcal{H}");
        System.out.println("2. \\frac{\\partial\\mathcal{B}}{\\partial t} \\quad & = \\quad -\\nabla\\times\\mathcal{E}");
        System.out.println("3. d{\\bf{B}} = \\frac{{\\mu _0 }}{{4\\pi }}\\frac{{Id\\ell \\times {\\bf{\\hat r}}}}{{r^2 }}");
        System.out.println("4. \\nabla\\cdot\\mathcal{B}\\quad & = \\quad 0,");
        System.out.print("Your answer: ");
        int ans2 = scanner.nextInt();
        if(ans2 == 3)
            score++;
        else if(ans1 == 1 || ans1 == 2 || ans1 == 4)
            error++;
        else
            System.out.println("Invalid answer. ");
        //Problem 3
        System.out.println("Compute f'(x) if f(x)=x");
        System.out.println("1.1  2.2  3.3  4.4");
        System.out.print("Your answer: ");
        int ans3 = scanner.nextInt();
        if(ans3 == 1)
            score++;
        else if(ans1 == 2 || ans1 == 3 || ans1 == 4)
            error++;
        else
            System.out.println("Invalid answer. ");
        System.out.println("Your total score is: "+score);
        System.out.println("The number of questions that you got wrong: "+error);
    }

}
