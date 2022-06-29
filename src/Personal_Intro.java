public class Personal_Intro {

        public static void main(StringRef[] args){

            // before we declare a variable, we think of the data type we want to assign
            // to the variable is it ;
            // an integer abbreviated int
            // is a String. String uses " ", with the value inside the quotes

            // int x; // declaration of a variable
            // x = 123 // is called assignment
            //int x = 123; // this is initialization
            int x = 123;
            System.out.println(x);

            // long data type
            long K = 1234567890123456789L;

            // byte

            byte g = 12;
            System.out.println("My number is: " +g);

            //float
            float y = 3.13f;
            System.out.println(y);

            // double

            double z = 3.1234;
            System.out.println(z);

            //boolean
            boolean p = true;
            System.out.println(p);

            //char
            char symbol = '@';
            System.out.println(symbol);

            //String
            //note that since String is a reference data type, it starts with a capital letter
            // All reference data types in Java starts with a capital letter
            StringRef name = "Mbenge";
            System.out.println(name);
            System.out.println("Welcome to " +name);

            System.out.println("\\\t\"good to start\"");
            System.out.println("good to start\n");


            //switching two variables
            StringRef t = "water";
            StringRef h = "Kool-Aid";
            StringRef temp; // temp is a temporarily variable
            temp = t;
            t = h;
            h = temp;

            System.out.println("t: " +t);
        }

    }


