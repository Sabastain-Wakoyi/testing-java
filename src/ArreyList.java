import java.util.ArrayList;

public class ArreyList {
    //Arraylist = a resizable array
    //Arraylist = Elements can be added and removed after compilation phase
    //ArrayList, stores reference data types

    public static void main(String[] args) {
        ArrayList<String> mboua = new ArrayList<String>();

        mboua.add("bieddwey");
        mboua.add("chi");
        mboua.add("veh");

        //mboua.set(0, "mpweh");
        mboua.remove(2);
        mboua.clear();
        for (int i = 0; i<mboua.size(); i++) {

        }
    }
}
