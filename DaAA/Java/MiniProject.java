import java.util.Scanner;

public class MiniProject {

    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        int guess = 0;
        do {
            System.out.println("Guess the Number : ");
            guess = sc.nextInt();
            if (guess == randomNum) {
                System.out.println("Congratulations! You guessed it right!");
                break;
            } else if (guess < randomNum) {
                System.out.println("Too Low");
            } else {
                System.out.println("Too High");
            }

            System.out.println("Try Again : ");
        } while (guess > 0);

        System.out.println("my Number was : " + randomNum);
    }
}
