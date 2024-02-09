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
            StringBuilder fullName = new StringBuilder();
            for (String arg : args) {
                fullName.append(arg).append(" ");
            }
            System.out.println("Hello, " + fullName.toString().trim() + "!");
        } else {
            System.out.println("Hello world!");
        }
    }
}
