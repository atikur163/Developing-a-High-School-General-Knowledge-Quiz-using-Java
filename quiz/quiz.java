import java.util.Scanner;

public class QuizGame {
    static String[] questions = {
        "What is the capital city of Bangladesh?",
        "Which river is known as the Padma in Bangladesh?",
        "Who is the Father of the Nation of Bangladesh?",
        "Which year did Bangladesh gain independence?",
        "What is the national flower of Bangladesh?"
    };

    static String[][] options = {
        {"Dhaka", "Chittagong", "Khulna", "Rajshahi"},
        {"Ganges", "Jamuna", "Meghna", "Brahmaputra"},
        {"Sheikh Mujibur Rahman", "Kazi Nazrul Islam", "Rabindranath Tagore", "Begum Rokeya"},
        {"1971", "1947", "1965", "1980"},
        {"Water Lily", "Sunflower", "Rose", "Jasmine"}
    };

    static int[] answers = {0, 0, 0, 0, 0}; // Indexes of correct options

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println((j + 1) + ". " + options[i][j]);
            }
            System.out.print("Your answer (1-4): ");
            int userAnswer = scanner.nextInt() - 1;

            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is " + options[i][answers[i]] + "\n");
            }
        }

        System.out.println("Quiz finished! Your score: " + score + "/" + questions.length);
        scanner.close();
    }
}
