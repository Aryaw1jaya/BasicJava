package Scanner;

import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter Name  : ");
        String name = myObj.nextLine();
        
        System.out.print("Enter Age   : ");
        int age = myObj.nextInt();
        
        System.out.print("Enter Salary: ");
        float salary = myObj.nextFloat();
        
        System.out.println("=================");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Salary  : " + salary); 
        }
    
}
