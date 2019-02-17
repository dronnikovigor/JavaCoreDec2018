package task2;

import java.util.*;

public class FAQ implements FaqInterface {
    private ResourceBundle questions;
    private ResourceBundle answers;

    private Set<String> keysQuestions;
    private Set<String> keysAnswers;

    FAQ() {
        System.out.println("Select your language:");
        System.out.println("1 - English");
        System.out.println("2 - Русский");
        System.out.println("answer: ");

        Scanner scanner = new Scanner(System.in);
        String ans = scanner.nextLine();
        int answer = Integer.parseInt(ans);

        if (answer == 1) {
            questions = ResourceBundle.getBundle("questions", new Locale("en", "EN"));
            answers = ResourceBundle.getBundle("answers", new Locale("en", "EN"));
        } else {
            questions = ResourceBundle.getBundle("questions", new Locale("ru", "RU"));
            answers = ResourceBundle.getBundle("answers", new Locale("ru", "RU"));
        }
        keysQuestions = questions.keySet();
        keysAnswers = answers.keySet();
    }

    @Override
    public String getAnswer(int num) {
        List<String> list = new ArrayList<>(keysAnswers);
        return answers.getString(list.get(num));
    }

    @Override
    public List<String> getQuestions() {
        List<String> questList = new ArrayList<>();
        for (String keysQuestion : keysQuestions) {
            questList.add(questions.getString(keysQuestion));
        }
        return questList;
    }
}
