public class arrays {
    public static void main(String[] args){
        //array is use to store multiple values in a single variable

        String[] pears = new String[4];
        pears[0] = "white";
        pears[1] = "black";
        pears[2] = "brown";
        pears[3] = "ripe";

        for (int i = 0; i<pears.length; i++){
            System.out.println(pears[i]);
        }

    }
}
