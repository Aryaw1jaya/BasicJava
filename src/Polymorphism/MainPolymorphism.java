package Polymorphism;

public class MainPolymorphism {

    public static void main(String[] args) {
           MainPolymorphism honk1 = new MainPolymorphism();
           honk1.honk();
           honk1.honk(10);
           honk1.honk(15, 3);
    }

    public void honk(){
        System.out.println("Tee,Tee...");
    }
    /*
    This is overloaded method of honk method as this method has same name but different parameters(1 in this case)
    here access modifier and return type is same .
     */
    public void honk(int decibel){
        System.out.println("Honking at "+decibel+" Decibel");
    }
    /*
    This is also overloaded method of honk method as this method has same name but different parameters(2 in this case)
    here access modifier is different but return type is same .
    */
    protected void honk(int decibel , int noOfTimes){
        System.out.println("No of times can honk "+noOfTimes+"x");
        for (int i=0;i<noOfTimes;i++){
            System.out.println("Honking at "+decibel+" Decibel (Tot....Tot....)");
        }
    }
  
}
