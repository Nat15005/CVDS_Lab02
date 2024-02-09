package edu.eci.cvds.patterns.archetype;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello world!");
        }
    }

}
