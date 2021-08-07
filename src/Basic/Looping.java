package Basic;

public class Looping {

    public static void main(String[] args) {
        System.out.println("Start Looping Do-While : ");
        doWhile();
        System.out.println("End Looping Do-While . ");
        System.out.println("Start Looping For : ");
        forLoop();
        System.out.println("End Looping For . ");
    }
    public static void doWhile(){
        int i = 0;
        do { // lakukan dulu baru lihat kondisi
          System.out.println(i);
          i++;
        }
        while (i < 5); // akan di loop jika (Kondisi)
    }
    public static void forLoop() {
        for (int x = 0; x <= 10; x = x + 2) { // For loop Int
            System.out.println(x);
        }
        
        String[][] cars = {
            {"Volvo", "BMW", "Ford", "Mazda"},
            {"Volvo", "BMW", "Ford", "Mazda"}
        };
        //Looping For Arrays 2D
        for (int i=0;i<2;i++){ // i = baris
            for (int j=0;j<4;j++){ // j = kolom
                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
        }
        
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
           for(int j = 0; j < myNumbers[i].length; ++j) {
              System.out.println(myNumbers[i][j]);
           }
        }
    }
}