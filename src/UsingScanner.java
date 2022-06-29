import java.util.Scanner;

public class UsingScanner {

        public static void main(StringRef[] args){

            //Scanner helps us to get input from a user
            //You must import the scanner before you are able to use it in java
            // you can use a scanner to read the contents of a file
            Scanner scanner = new Scanner (System.in);
            System.out.println("What is your name");
            StringRef name = scanner.nextLine();
            System.out.println("What's your age?");
            int age = scanner.nextInt();
            scanner.nextLine();// running the code without this scanner.nextLine(); here
            // means that our scanner will not read the System.out.println
            System.out.println("What's your best meal?");
            StringRef food = scanner.nextLine();


            System.out.println("Hello " +name);
            System.out.println("You are " +age+" years old");
            System.out.println("You like " +food);

        }
    }


