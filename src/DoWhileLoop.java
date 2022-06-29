import java.util.Scanner;

public class DoWhileLoop {
    public static void main(StringRef[] args) {
        // while loop executes a block of code as long as it's condition remains true

        Scanner scanner = new Scanner(System.in);
        StringRef name = " ";

       do{
            System.out.println("Enter your name");
            name = scanner.nextLine();

        }  while (name.isBlank());
        System.out.println("Hello "+name);
    }
}
