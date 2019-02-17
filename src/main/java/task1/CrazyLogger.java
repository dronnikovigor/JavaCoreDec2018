package task1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CrazyLogger implements LogInterface {
    private Calendar calendar;
    private StringBuilder log;
    private DateFormat dateFormat;

    CrazyLogger() {
        calendar = Calendar.getInstance();
        log = new StringBuilder();
        dateFormat = new SimpleDateFormat("dd-mm-YYYY : hh-mm");
    }

    @Override
    public void log(CharSequence msg) {
        Date date = calendar.getTime();
        String formattedDate = dateFormat.format(date);
        log.append(formattedDate).append(" - ").append(msg).append("\n");
    }

    @Override
    public String find(CharSequence info) {
        StringBuilder output = new StringBuilder();
        String[] logs = log.toString().split("\n");
        for (String s : logs) {
            if (s.contains(info)) {
                output.append(s).append("\n");
            }
        }
        return output.toString();
    }

    @Override
    public void show() {
        System.out.println(log);
    }
}
