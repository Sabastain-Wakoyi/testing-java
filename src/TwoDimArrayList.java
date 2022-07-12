import java.util.*;

public class TwoDimArrayList {
    public static  void main (String[] args) {
        // 2D ArrayList = a dynamic list of lists
        // you can change the size of these lists during runtime

        ArrayList<ArrayList<String>> marketList = new ArrayList();

        ArrayList<String> pamList = new ArrayList();
        pamList.add("biscut");
        pamList.add("garlic");
        pamList.add("pizza");

        ArrayList<String> cashList = new ArrayList();
        cashList.add("tomatoes");
        cashList.add("fertilizer");
        cashList.add("maize seed");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("top");
        drinksList.add("malta");
        drinksList.add("coca cola");
        drinksList.add("UCB");

        marketList.add(pamList);
        marketList.add(cashList);
        marketList.add(drinksList);

        //System.out.println(pamList.get(0));
        //System.out.println(pamList.get(0).get(0));
        //System.out.println(pamList.get(2).get(1));
        System.out.println(drinksList);
    }

}
