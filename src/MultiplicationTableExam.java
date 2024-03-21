import java.util.Scanner;
import java.util.Random;
public class MultiplicationTableExam {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int score = 0;

            for (int i = 0; i < 10; i++) {
                int number1 = 1 + random.nextInt(10);
                int number2 = 1 + random.nextInt(10);
                System.out.printf("What is %d * %d? ", number1, number2);
                int answer = scanner.nextInt();

                if (answer == number1 * number2) {
                    System.out.println("Correct !");
                    score++;
                }else {
                    System.out.println(" Wrong. The correct answer is " + (number1 * number2) + ".");

                }
            }
            if ( score == 10) {
                System.out.println("Congratulations ! You have mastered the multiplication tables.");
                break;
            } else {
                System.out.println("Your score is " + score + ". Let's try another round to improve !");
            }
        }
    }
}
