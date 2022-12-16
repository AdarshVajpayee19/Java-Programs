/*
==========================================================================================================
                                               STATIC-BLOCK.
==========================================================================================================
                                    
Static block is used for initializing the static variables. This block gets executed when the class is loaded in the memory. A class can have multiple Static blocks, which will execute in the same sequence in which they have been written into the program.


First, JVM executes the static block, then it executes static methods, and then it creates the object needed by the program. Finally, it executes the instance methods. JVM executes a static block on the highest priority basis. It means JVM first goes to static block even before it looks for the main() method in the program.

*/

public class StaticBlock 
{
    static // static block
    {
        System.out.println("Static block");
    }

    public static void main(String args[]) // static method
    {
        System.out.println("Static method");
    }
}
