package Basic;

import java.time.LocalDate; // import the LocalDate class
import java.time.LocalTime; // import the LocalTime class
import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.format.DateTimeFormatter; // import LocalDateTimeFormatter class

public class Date {

    public static void main(String[] args) {
        LocalDate tgl = LocalDate.now();  // Create a date object
        System.out.println(tgl);          // Display the current date
        
        LocalTime time = LocalTime.now();
        System.out.println(time);
        
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting   : " + myDateObj);
        
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting    : " + formattedDate);
    }
    
}
