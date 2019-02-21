package task3;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class HtmlParserTest {
    @Test
    public void test() {
        HtmlParser htmlParser = new HtmlParser();
        StringBuilder content = new StringBuilder();

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(getClass()
                                    .getClassLoader()
                                    .getResource("Java.SE.03.Information_handling_task_attachment.html")
                                    .getPath()),
                            "Cp1251"));

            String str;
            while ((str = bufferedReader.readLine()) != null) {
                content.append(str);
            }

            System.out.println("Sequentially: " + htmlParser.isSequential(content.toString()));
            System.out.println("Sentences with links:\n" + htmlParser.fetchSentences(content.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}