package edu.eci.cvds.patterns.archetype;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args) {
        if (args.length > 0) {
            StringBuilder saludo = new StringBuilder("Hola");

            for (String arg : args) {
                saludo.append(" ").append(arg);
            }
            System.out.println(saludo.toString());

        } else {
            System.out.println("Hola mi mundo!");
        }
    }
}