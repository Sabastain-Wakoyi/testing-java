public class IfStatements {

    public static void main(String[] args) {
        // if statement; this performs a block of code if it's condition evaluates to be true.

        int age = 5;
        if (age >=60) {
            System.out.println("Ok Boomer");
        }
        else  if(age>=18){
            System.out.println("You are an adult");
        }
        else if(age>=13){
            System.out.println("You are a teenager");
        }
        else if(age == 5){
            System.out.println("You are a kid");
        }
        else {
            System.out.println("You are not an adult");
        }
    }
}
