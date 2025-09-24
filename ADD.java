import java.util.Scanner;

public class ADD {
    public static void main(String[] args) {


        byte a=10;
        byte b=20;

   //     int c = (a + b);

        byte c = a;
        /*
       Even though both a and b are byte, when you perform arithmetic (+, -, *, /) in Java,
      all operands smaller than int (like byte, short, char) are automatically promoted to int.

          So a + b is not a byte expression — it becomes an int result.
*/

      //  System.out.println(c);


        Scanner sc = new Scanner(System.in);
        // This line is like giving the computer a microphone named sc so it can hear what you type

        System.out.print("Enter any Number - ");
        // Here, the computer is talking to you, asking politely for a number.

        int i = sc.nextInt();
        // Now, whatever number you type, the computer hears it through the microphone (sc) and keeps it safely in a small box called i

        System.out.println(i);
    }
}

/*
Even though both a and b are byte, when you perform arithmetic (+, -, *, /) in Java,
all operands smaller than int (like byte, short, char) are automatically promoted to int.

So a + b is not a byte expression — it becomes an int result.
*/