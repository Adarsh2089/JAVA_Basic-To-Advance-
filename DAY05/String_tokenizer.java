package DAY05;

import java.util.StringTokenizer;

public class String_tokenizer {
    public static void main(String[] args) {
                // Input string
        String s = "Hello learners how are you";

        // Create a StringTokenizer object 
        // with space as the delimiter
        StringTokenizer st = new StringTokenizer(s, " ");


        // Tokenize the string and print each token
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
    /*
      StringTokenizer --
              StringTokenizer class in Java is used to break a string into tokens.  
    */
}

