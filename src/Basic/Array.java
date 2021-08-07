package Basic;

public class Array {

    public static void main(String[] args) {
        array1D();
        System.out.println();
        array2D();
    }
    public static void array1D(){
        String[] store = {"Steam","GOG","Epic Games Store"};

        //Menampilkan isi array dengan perulangan
        for (int i=0;i<3;i++){
                System.out.print(store[i]+" ");      
        }
    }
    public static void array2D(){
        //Deklarasi array 2 dimensi
        String[][]huruf = {
            {"A","B","C"},
            {"D","E","F"},
            {"G","H","I"},        
        };

        //Menampilkan isi array dengan perulangan
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(huruf[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
