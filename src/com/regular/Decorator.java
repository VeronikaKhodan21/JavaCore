package com.regular;

public class Decorator {
    /**
* @param a a number requiring decoration
 * @return formate string
 * */
    public static String decorate(int a) {
    /*
        * The method decorates a number by adding strings to 
        *  it using the string formatting function.
    * */
    return String.format("Here is your number: %d.", a);
    }
}
