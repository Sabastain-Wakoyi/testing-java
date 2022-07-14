import java.util.ArrayList;
public class ForEachLoop {

    public static void main(String[] args){
        //for-each loop also called enhanced for-loop = traversing technique to iterate through the elements
        // in an array/collection
        //for-each loop is less steps, more readable and disadvantageous that it's less flexible

       // String[] animals = {"dog", "dog", "rat", "bird"};
        ArrayList<String> animals = new ArrayList<String>();

        for (String i : animals) {
            System.out.println(i);
        }
    }
}
