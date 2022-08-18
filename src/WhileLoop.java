import java.util.Scanner;

public class WhileLoop {

    public static void main(StringRef[] args) {
        // while loop executes a block of code as long as it's condition remains true

        Scanner scanner = new Scanner(System.in);
        StringRef name = D" ";
        while (name.isBlank()) {
            System.out.println("Enter your name");
            name = scanner.nextLine();

        }
        System.out.println("Hello "+name);
    }
}
