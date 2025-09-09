class p3_operators {
    public static void main (String[] args) {
        int a = 10;
        int b = 3;
        boolean c = true;
        boolean d = false;

        //arithmetic operators (+ , - , * , / , %)
        System.out.println("Arithmetic Operators: ");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b) + "\n");

        //Relational Operators (== , != , > , >= , < , <=)
        System.out.println("Relational Operators: ");
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a <= b = " + (a <= b) + "\n");

        //Logical operators (&& , || , !)
        System.out.println("Logical Operators: ");
        System.out.println("a && b = " + (c && d));
        System.out.println("a || b = " + (c || d));
        System.out.println("! true = " + !(c));
        System.out.println("! false = " + !(d) + "\n");

        //Bitwise operators (& , | , !)
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("! true = " + ! (c) + "\n");

        //Unary operators (n++ , ++n , n-- , --n)
        int x = 5, y = 8;
        System.out.println("x = " + x);
        System.out.println("x++ = " + (x++));
        System.out.println("x = " + x);
        System.out.println("++x " + (++x));
        System.out.println("Y = " + y);
        System.out.println("Y-- = " + (y--));
        System.out.println("Y =  " + y);
        System.out.println("--Y = " + (--y) + "\n");

        //Ternary operators ( ? : )
        System.out.println("Ternary Operators: ");
        boolean ans = (a > b) ? true : false;
        System.out.println("a > b: " + ans);
    }

}