package de.forkster.java1;

//import java.lang.management.ManagementFactory;

class FirstClass {

    public static void main(String[] args)
    {
        GameObject gameObject1 = new GameObject(5, "Fitz");
        GameObject gameObject2 = new GameObject(7, "Quark");

        final GameObject[] divisor = {gameObject1, gameObject2};

        String output = "";

        int numberOfIteration = 100;
        int index = 1;
        while (index <= numberOfIteration)
        {
            for (int indexOfDivisor = 0; indexOfDivisor < divisor.length; indexOfDivisor++)
            {
                if ( index % divisor[indexOfDivisor].Value == 0)
                {
                    output += divisor[indexOfDivisor].Spell;
                }
            }

            if (!output.equals(""))
            {
                System.out.println(output);
            }
            else
            {
                System.out.println(index);
            }

            output = "";
            index++;
        }
    }
}
