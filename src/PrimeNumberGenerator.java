import java.sql.SQLOutput;
import java.util.Scanner;
public class PrimeNumberGenerator {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start integer :");
        int start = scanner.nextInt();
        System.out.print("Enter the end integer :");
        int end = scanner.nextInt();
        System.out.println("Prime numers between" + start + "and" + end + ":");
        for (int number = start; number <= end; number++){
            if (isPrime(number)){
                System.out.println(number + " ");
            }
        }
    }
    public static boolean isPrime(int number){
        if(number <= 1) {
            return false;
        }
        for ( int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
