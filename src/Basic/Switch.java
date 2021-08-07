package Basic;

public class Switch {

    public static void main(String[] args) {
        // Switch Case hari
        int day = 7;
        switch (day) {
          case 1:
            System.out.println("Monday");
            break;
          case 2:
            System.out.println("Tuesday");
            break;
          case 3:
            System.out.println("Wednesday");
            break;
          case 4:
            System.out.println("Thursday");
            break;
          case 5:
            System.out.println("Friday");
            break;
          case 6:
            System.out.println("Saturday");
            break;
          case 7:
            System.out.println("Sunday");
            break;
        } // Switch Case no Default
        
        // Switch case with Default
        int jam = 22;
        switch (jam) {
          case 7:
            System.out.println("Sekaran masih pagi");
            break;
          case 12:
            System.out.println("Sekarang sudah Siang");
            break;
          default:
            System.out.println("hari ini sudah larut malam");
        }
 
    }
}
