public class Statik {

    public static void main(String[] args){
        //static= modifier. A single copy of a variable/method is created and share.
        // the class owns the static member

        Friend friend1 = new Friend("Happy");
        Friend friend2 = new Friend("Pap");
        Friend friend3 = new Friend("Hap");

        System.out.println(Friend.numberofFriends);


    }
}
