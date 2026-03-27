package LAB7;
enum Result {
    CORRECT, WRONG, NOT_ANSWERED
}

public class Quiz {
    public static void main(String[] args) {

        char[] correct = {'C', 'A', 'B', 'D'};
        char[] submitted = {'C', 'B', 'B', 'D'};

        int correctCount = 0, wrongCount = 0;

        System.out.println("Q\tSubmitted\tCorrect\tResult");

        for (int i = 0; i < correct.length; i++) {
            Result r;

            if (submitted[i] == 'X') {
                r = Result.NOT_ANSWERED;
            } else if (submitted[i] == correct[i]) {
                r = Result.CORRECT;
                correctCount++;
            } else {
                r = Result.WRONG;
                wrongCount++;
            }

            System.out.println((i + 1) + "\t" + submitted[i] + "\t\t" + correct[i] + "\t" + r);
        }

        System.out.println("Correct Answers: " + correctCount);
        System.out.println("Wrong Answers: " + wrongCount);

        if (correctCount >= 2)
            System.out.println("Candidate Passed");
        else
            System.out.println("Candidate Failed");
    }
}
