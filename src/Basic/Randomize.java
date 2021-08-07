package Basic;

import java.util.Random;

public class Randomize {
    
    static int counter = (int) 4;
    
    static boolean isLucky(int n){
        if (counter > n){
            return true;
        }
        else if (n%counter == 0){
            return false;
        }
        int next_position = n - (n/counter);
        counter++;
        return isLucky(next_position);
    }
    public static void Lucky(){
        int x = 5;
        if( isLucky(x) )
            System.out.println(x+" is a lucky no.");
        else
            System.out.println(x+" is not a lucky number");
    }
    
    public static void main(String[] args) {
        Random rand = new Random();
        
        int rand_int1 = rand.nextInt(1000);
        System.out.println("Random Integers: "+rand_int1);
        
        double rand_dub1 = rand.nextDouble();
        System.out.println("Random Doubles: "+rand_dub1);
    }
}
