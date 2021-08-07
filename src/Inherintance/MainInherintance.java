package Inherintance;

public class MainInherintance extends Second{ // Extends Second Class

  private String modelName = "Mustang";
  
  public static void main(String[] args) {
      
    MainInherintance myFastCar = new MainInherintance(); // Inisiasi Main Class
    myFastCar.honk();
    System.out.println(myFastCar.brand);
    System.out.println(myFastCar.modelName);
  }
    
}
