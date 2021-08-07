package Basic;

public class MethodObject {
    // INI Constructors
    int ModelYear;
    String NamaMobil;
    
    private MethodObject(int Tahun,String Nama){ // Inisisasi di Constructors
        ModelYear = Tahun;
        NamaMobil = Nama;
    }
    
    public static void main(String[] args) {
        StaticMethod();     // Dengan Static tidak usah inisiasi Object lagi
        
        MethodObject TSObject = new MethodObject(0, ""); // Harus inisiasi Object
        TSObject.TanpaStatic(); // Baru dipanggil Methodnya
        
        System.out.println("=============================");
        
            // Inisiasi Method Parameternya Harus sama dengan Di Constructors
        MethodObject MyCar = new MethodObject(1975, "Lamborgini"); 
        MyCar.fullThrottle();
        MyCar.speed(350);
        
        System.out.println("Tahun Rilis     : "+MyCar.ModelYear);
        System.out.println("Merek           : "+MyCar.NamaMobil);
    }
    
    // Method dengan Static
    static void StaticMethod(){
        System.out.println("Ini Static Method");
    }
    // Hanya Method tanpa Static Default Public
    void TanpaStatic(){
        System.out.println("Ini Method tanpa Static");
    }
    
    // Create a fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }
  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed       : " + maxSpeed);
  }
    
}
