import java.util.*;

class Main {
    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        Scanner scanner = new Scanner(System.in);

        final int bound = 100;

        final int maxScore = 100;
        int score = 0;

        final int totalAttempt = 10;
        int attempt = 0;

        int randomInt = random.nextInt(bound);

        System.out.println("Guess the number between 1 and 100");
        do {

            int userInt = scanner.nextInt();

            if(userInt > randomInt) {
                System.out.println("Your guess is too high");
            } else if(userInt < randomInt) {
                System.out.println("Your guess is too low");
            } else {
                System.out.println("That's a right guess");
                score += attempt;

                System.out.println("Want to play again? (Y/N)");
                String answer = scanner.next();

                if(answer.equals("Y")) {
                    attempt = totalAttempt;
                    randomInt = random.nextInt(bound);
                    System.out.println("Guess the number between 1 and 100");
                } else {
                    break;
                }
            }

            attempt++;
        } while(attempt != totalAttempt);

        // Score based on total attempts taken by user to guess the number
        System.out.println("Your score is " + (maxScore - score));

    }
}