package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlParser implements HtmlParserInterface {
    @Override
    public String fetchSentences(String text) {
        String regex = "[^.?!>]*(?<=[.?\\s!>])(\\(((Рис|рис)\\.\\s\\d*)\\))[^.?!]*[.?!]";
        StringBuilder fetchedSentences = new StringBuilder();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            if (matcher.group().length() != 0) {
                String sentence = matcher.group().trim() + "\n";
                fetchedSentences.append(sentence);
            }
        }

        return fetchedSentences.toString();
    }

    @Override
    public boolean isSequential(String stringToCheck) {
        String regex = "\\((Рис|рис)\\.\\s(?<number>\\d*)\\)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(stringToCheck);
        List<Integer> numbers = new ArrayList<>();

        while (matcher.find()) {
            if (matcher.group().length() != 0) {
                String numberString = matcher.group("number").trim();
                numbers.add(Integer.parseInt(numberString));
            }
        }

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) > numbers.get(i + 1)) {
                return false;
            }
        }

        return true;
    }
}
