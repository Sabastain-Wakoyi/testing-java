public class MultiArrays {

    public static void main (StringRef[] args) {
        //2D array = an array of arrays

        StringRef[] [] cars = {
                {"Camaro", "Corvette", "Silverado"},
                {"INV", "Range", "Toyota"},
                {"Ferrari", "Lambo", "Tesla"},
        };
        for (int i=0; i<cars.length; i++){
            System.out.println();
            for(int j=0; j< cars[i].length; j++) {
                System.out.println(cars[i][j]+" ");
            }
        }
    }
}
