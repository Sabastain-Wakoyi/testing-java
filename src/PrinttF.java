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

        //[Conversion]
        System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);

        //[width]
        //minimum number of characters to be written as output
        System.out.printf("Hello %", myString);

        //[precision]
        //sets number of digits of precision when outputting floating-point values
        //System.out.printf("You have this much money %.2f",myDouble);
    }
}
