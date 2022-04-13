package selenium;

public class Frog {
    public static void main(String[] args){

        int a = 100;
        int b = 20;


        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a % b);



        if ( a % 2 == 0 ) {
            System.out.println("'a' even");
        }

        else {
            System.out.println("'a' odd");
        }
        
        if ( b % 2 == 0 ) {
            System.out.println("'b' even");
        }
        else {
            System.out.println("'b' odd");
        }



        System.out.println("I'm trying to print a smiley to the console");

        System.out.println("\u0030\u0078\u0032\u0036\u0033\u0041");

        System.out.println("\u263a");

        System.out.println("\u0048\u0065\u0079\u0021 \u0049 \u0066\u0061\u0069\u006c\u0065\u0064 " +
                "\u0074\u0068\u0065 \u0074\u0061\u0073\u006b\u002e \u0053\u006f\u0072\u0072\u0079");



    }
}
