import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        // logical operators are used to connect two or more expressions

        // && = (AND) both conditions must be true
        // || = (OR) either condition must be true
        // ! = (NOT) reverses boolean value of condition


        // &&, AND logical operator
//        int temp = 25;
//        if(temp >=35){
//            System.out.println("It is hot outside");
//        }
//        else if (temp >=20 && temp <= 35){
//            System.out.println("It is warm outside");
//        }
//        else{
//            System.out.println("It is cold outside");
//        }

        // ||, OR logical operator

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("You are playing a game!, Press q or Q to quit");
//        String response = scanner.next();
//        if(response.equals("q") || response.equals("Q")){
//            System.out.println("You Quit the game");
//        }
//        else {
//            System.out.println("You are still playing the game");
//        }

        // !, NOT logical operator
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game!, Press q or Q to quit");
        String response = scanner.next();
        if(!response.equals("q") && !response.equals("Q")){
            System.out.println("You are still playing the game");
        }
        else {
            System.out.println("You quit the game");
        }

    }
}