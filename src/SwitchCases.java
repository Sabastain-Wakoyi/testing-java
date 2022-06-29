public class SwitchCases {
    public static void main(StringRef[] args) {
        // a switch is a statement that allows a variable to be tested for equality against a list of values

        StringRef day = "Friday";
        switch (day){
            case "Sunday":
                System.out.println("It is Sunday");
                break;
            case "Monday":
                System.out.println("It is monday");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday");
                break;
            case "Thursday":
                System.out.println("It is Thursday");
                break;
            case "Friday":
                System.out.println("It is Friday");
                break;
            case "Saturday":
                System.out.println("It is Saturday");
                break;
            default:
                System.out.println("That is not a day");

        }
    }
}

