public class MathsClass {
    public  static  void main(StringRef[] args){


        double x = 3.14;
        double y = -10;
        //Max Method, used in finding the highest value between integers
        //Min Method, finds the least of two values
        //Absolute value is the value of an integer without the negative sign
        //square root method(sqrt) gives the square root of a number. There exist no square root for a negative number
        //round, this is to round up a number
        //ceil will round up
        //floor will round down

        double z = Math.max(x,y);//Maximum method
        double k = Math.min(x,y);//Minimum method
        double p = Math.abs(y);//Absolute method
        double l = Math.sqrt(y);//square root method
        double f = Math.round(x);//round method
        double h = Math.ceil(x);//ceil to round up
        double q = Math.floor(x);//floor to round down
       System.out.println("maximum value is "+z);
       System.out.println("minimum value is "+k);
       System.out.println(p);
       System.out.println(l);
       System.out.println(f);
       System.out.println(h);
       System.out.println(q);
    }
}
