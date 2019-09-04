/*
String completion assignment
The following code is supposed to ask the user their pet's name, breed and age. Add the 3 lines necessary to make this work...
 */

import java.util.Scanner;

public class PetQuestions
{
    public static void main( String[] args )
    {
        //Added line
        Scanner keyboard = new Scanner(System.in);

        String name;
        String breed;
        int age;

        System.out.print( "Greetings. What is your pet's name? " );
        name = keyboard.next();

        System.out.print( "What kind of animal is " + name + "? " );
        //Added line
        breed = keyboard.next();
        System.out.print( "How old is " + name + "? ");
        //Added line
        age = keyboard.nextInt();

        System.out.println( name + " is your " + breed + " and it is " + age );
    }
}
