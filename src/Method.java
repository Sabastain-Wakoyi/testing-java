public class Method {
    public static void main(String[] args){
        //method in java is a block of code that is executed whenever  it is called upon

        int x = 7;
        int y = 8;

       int z = add(x,y);

       System.out.println(add(x,y));
       System.out.println(z);

//        String name = "Jevian";
//        int age = 21;
//        hello(name);
    }

    //static  void hello(String name, int age) {
//        System.out.println("Hello " + name);
//        System.out.println("Hello " + age);
    //}

    static int add(int x, int y){
        int z = x + y;
                return z;
    }

}
