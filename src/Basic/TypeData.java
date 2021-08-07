package Basic;

public class TypeData {

    public static void main(String[] args) {
        /*Start Variable*/
        String hello = "Hello ";
        String world = "World";
        System.out.println(hello+world);
        System.out.println(hello.toUpperCase());
        System.out.println();
        
        /*converting a smaller type to a larger type size
            byte -> short -> char -> int -> long -> float -> double*/
        float x = (float) 2.5;
        double y = 7.3;
        float tambah = (float) (x+y);
        double kurang = (double) (x-y);
        double kali = x*y;
        float bagi = (float) (x/y);
        System.out.println("X tambah Y adalah " +tambah);
        System.out.println("X kurang Y adalah " +kurang);
        System.out.println("X kali   Y adalah " +kali);
        System.out.println("X bagi   Y adalah " +bagi);
        System.out.println();
        
        boolean murid = false;
        boolean mahasiswa = true;
        String A = "Arya adalah Mahasiswa.";
        String B = "Arya adalah Murid.";
        
        if (mahasiswa == true && murid == false){
            System.out.print(A);
            System.out.println(" Bukan Murid");
        }
        else if(mahasiswa == false && murid == true){
            System.out.print(B);
            System.out.println(" Bukan Mahasiswa");   
        }
        else{
            System.out.println("Arya Tidak Sekolah");
        }
        
        Universitas();
        Math();
        convertString();
    }
    private static void Universitas(){
        String Universitas = "Universitas ";
        String Indonesia = "Indonesia";

        System.out.println(Universitas+Indonesia);
    }
    public static void Math(){
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        System.out.println(Math.sqrt(64));
    }
    public static void convertString(){ // String => Number
        String str = "25";
        String nmbr = "200";
        try{
            Integer stringNumber = Integer.valueOf(nmbr); // String to Int dengan ValueOf
            System.out.println(stringNumber); // output = 25
            
            double angka = Double.parseDouble(str); //String to Double dengan Parse
            int number = Integer.parseInt(str); //String to Int dengan Parse
            System.out.println(angka);
            System.out.println(number); // output = 25
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
    }
}
