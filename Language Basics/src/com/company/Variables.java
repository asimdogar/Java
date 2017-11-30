package com.company;

/**
 * Main Class
 */
public class Variables {
    static int NUM_OF_CARS;

    /**
     * @param args Arguments
     */
    public static void main(String[] args) {
        // write your code here
        final int passengers;//declaration of variable;
        int noOfCars = 10; //initialization of variable;
        function(noOfCars);//arguments passed to function.
        String driver;
        driver = "Hamesh";
        //String is a class we can call function from it.
        System.out.println(driver.length());
        driver.toLowerCase();
        //String cancatenation
        System.out.println("The length of String is " + driver.length());
        //Naming convention should be camel casse,its easy to read
        int hotelRooms = 100;
        //case sensitive,start with letter,can't hv white spaces
        driver.replace('a', 'l');//replace and return value
        System.out.println(driver.replace('a', 'l'));
        String test = " Algorithms ";
        System.out.println(test.trim());

        double a = 5 / 2;//because two val 5 and 2 are int so one of them should be double to get result in double.
        //it simply throw away  the fractional part.
        System.out.println(a);
        passengers = 4;
        int a1;
        //Local variables are slightly different; the compiler never assigns a default value to an uninitialized local variable.
        // If you cannot initialize your local variable where it is declared, make sure to assign it a value before you attempt to
        // use it.
        // Accessing an uninitialized local variable will result in a compile-time error.
        //  System.out.println(a1);
        //Literals

        boolean result = true;
        char capitalC = 'C';
        byte b = 100;
        short s = 10000;
        int i = 100000;

        int decVal = 15;
        int hexVal = 0xFFFF;
        int binaryVal = 0b0001;

        double d1 = 123.4;
        // same value as d1, but in scientific notation
        double d2 = 1.234e2;
        float f1 = 123.4f;
        System.out.println(d2);

        long creditCardNumber = 1234_5678_9012_3456L;
        long socialSecurityNumber = 999_99_9999L;
        float pi = 3.14_15F;
        long hexBytes = 0xFF_EC_DE_5E;
        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;


        // Invalid: cannot put underscores
// adjacent to a decimal point
        //float pi1 = 3_.1415F;
// Invalid: cannot put underscores
// adjacent to a decimal point
        // float pi2 = 3._1415F;
// Invalid: cannot put underscores
// prior to an L suffix
        // long socialSecurityNumber1 = 999_99_9999_L;

// OK (decimal literal)
        int x1 = 5_2;
// Invalid: cannot put underscores
// At the end of a literal
        //  int x2 = 52_;
// OK (decimal literal)
        int x3 = 5_______2;

// Invalid: cannot put underscores
// in the 0x radix prefix
        //  int x4 = 0_ x52;
// Invalid: cannot put underscores
// at the beginning of a number
        // int x5 = 0x_52;
// OK (hexadecimal literal)
        int x6 = 0x5_2;
// Invalid: cannot put underscores
// at the end of a number
        //  int x7 = 0x52_;


    }

    /**
     * Test function
     *
     * @param a parameter passed to function
     * @return after calculation result that should return an int
     */
    public static int function(int a) {
        a += 1;
        return a;
    }

}
