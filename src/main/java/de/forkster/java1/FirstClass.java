package de.forkster.java1;

import java.lang.management.ManagementFactory;

class FirstClass {

    public static void main(String[] args)
    {
        GameObject Obj1 = new GameObject();
        Obj1.Spell = "Fitz";
        Obj1.Value = 5;
        GameObject Obj2 = new GameObject();
        Obj2.Spell = "Quark";
        Obj2.Value = 7;

        final GameObject DEVISOR [] = {Obj1, Obj2};

        String Output = "";

        int index = 1;
        while (index <= 100)
        {
            for (int indexOfDevisor = 0; indexOfDevisor < DEVISOR.length; indexOfDevisor++)
            {
                if ( index % DEVISOR[indexOfDevisor].Value == 0)
                {
                    Output += DEVISOR[indexOfDevisor].Spell;
                }
            }

            if (Output != "")
            {
                System.out.println(Output);
            }
            else
            {
                System.out.println(index);
            }

            Output = "";
            index++;
        }
    }
}
