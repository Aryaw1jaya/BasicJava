package Basic;

public class IfElse {

    public static void main(String[] args) {
        //Conditional Simple
        int time = 20;   //Condition    //True          //False
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
        
        //If Else 2 Condition
        int jam = 14;
        if (jam > 6 & jam <= 11) {
          System.out.println("Good morning.");
        } else if (jam >= 12 & jam < 17) {
          System.out.println("Good day.");
        } else {
          System.out.println("Good evening.");
        }

    }
}
