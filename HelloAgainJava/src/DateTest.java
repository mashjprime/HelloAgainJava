import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTest {

    public static void test() {
        System.out.println("Hello World");

        int birthYear = 1988;
        int birthMonth = 6;
        int birthDay = 24;

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }

}
