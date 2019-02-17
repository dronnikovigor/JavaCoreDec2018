package task2;

import org.junit.Test;

import java.io.ByteArrayInputStream;

public class FAQTest {
    @Test
    public void test1() {
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);
        FAQ faq = new FAQ();

        System.out.println(faq.getQuestions());

        System.out.println(faq.getAnswer(0));
        System.out.println(faq.getAnswer(1));
        System.out.println(faq.getAnswer(2));
        System.out.println(faq.getAnswer(3));

        System.setIn(System.in);
    }
    @Test
    public void test2() {
        ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
        System.setIn(in);
        FAQ faq = new FAQ();

        System.out.println(faq.getQuestions());

        System.out.println(faq.getAnswer(0));
        System.out.println(faq.getAnswer(1));
        System.out.println(faq.getAnswer(2));
        System.out.println(faq.getAnswer(3));

        System.setIn(System.in);
    }

}