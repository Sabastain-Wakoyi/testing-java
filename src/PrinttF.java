public class PrinttF {

    public static void main (String[] args){
        //printf() is an optional method to control, format, and display text to the console window
        // two arguments = format string + (object/variable/value)
        //% [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Jevian";
        int myInt = 100;
        double myDouble = 1000;
        System.out.printf("This is a format string", 123);
        System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%d", myDouble);
        System.out.printf("%d", myDouble);
        System.out.printf("%d", myDouble);
    }
}
