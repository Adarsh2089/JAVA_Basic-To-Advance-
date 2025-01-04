package Basics; // Packages help to group related classes together, making it easier to manage large projects.

public class base {

    public static void main (String[] args){
       System.out.println("Welcome to JAVA ");
    }
}

/* 
public: This means the class is accessible from anywhere in the program.
class: This keyword defines a new class (which is a blueprint for creating objects in Java).
base: This is the name of the class. (Conventionally, class names should start with an uppercase letter, so Base would be preferred.)
*/

/* 

static: This means the method belongs to the class and can be called without creating an instance of the class.
void: This means the method does not return any value.
main: This is the name of the method, and it's special because the Java Virtual Machine (JVM) looks for this method to start execution.
String[] args: This is an array of String arguments that can be passed to the program from the command line.
*/


/*   
System: This is a built-in Java class that provides access to the system (like standard input and output).
out: This is a static member of the System class, representing the standard output stream (usually the console).
println(): This method prints the text and moves the cursor to the next line.
"Welcome to JAVA ": This is the message that gets printed.
*/