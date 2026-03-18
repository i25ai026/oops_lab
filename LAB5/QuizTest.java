package LAB5;
enum Result {
    CORRECT, WRONG, UNANSWERED
}

public class QuizTest {
    public static void main(String[] args) {

        char correct[] = {'C','A','B','D','B','C','C','A'};
        char submitted[] = new char[8];

        for (int i = 0; i < 8; i++) {
            if (i < args.length) {
                submitted[i] = args[i].charAt(0);
            } else {
                submitted[i] = 'X';
            }
        }

        int correctCount = 0, wrongCount = 0;

        System.out.println("QUESTION SUBMITTED ANS CORRECT ANS RESULT");

        for (int i = 0; i < 8; i++) {
            Result res;

            if (submitted[i] == 'X') {
                res = Result.UNANSWERED;
            } else if (submitted[i] == correct[i]) {
                res = Result.CORRECT;
                correctCount++;
            } else {
                res = Result.WRONG;
                wrongCount++;
            }

            System.out.println((i+1) + "        " + submitted[i] + "             " + correct[i] + "           " + res);
        }

        System.out.println();
        System.out.println("No. of correct answers: " + correctCount);
        System.out.println("No. of wrong answers: " + wrongCount);
    }
}
