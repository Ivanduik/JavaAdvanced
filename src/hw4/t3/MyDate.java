package hw4.t3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyDate {
    private  String inputDateStr;

    public MyDate() {
    }
    public MyDate(String inputDateStr)
    {
        this.inputDateStr=inputDateStr;
    }
    public  void setDateOfBirthday(String inputDateStr){
        this.inputDateStr=inputDateStr;
    }
    public GregorianCalendar dateDiff() throws ParseException {
        GregorianCalendar calendar = new GregorianCalendar();
        Period period;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        LocalDate inputDateDate, nowDateDate;
        nowDateDate = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        try {
            inputDateDate = dateFormat.parse(inputDateStr).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } catch (ParseException e) {
            throw new ParseException("Error!!! Format date - dd-MM-yyyy!!! ", e.getErrorOffset());
        }
        period = Period.between(inputDateDate, nowDateDate);
        calendar.set(period.getYears(), period.getMonths(), period.getDays());
        return calendar;
    }
}
