package DAY05;

public class String_BufferBuilder {
    public static void main(String[] args) {

        StringBuffer name = new StringBuffer();
        name = name.append(" ");
        System.out.println(name.capacity()); // by default it gives 16 character it will increase if we assign any string in it
        
        StringBuilder name1 = new StringBuilder(); // by default it also gives 16 character it will increase if we assign any string in it
        System.out.println(name1.capacity());
    }
}

/*
 StringBuffer --
             StringBuffer is a peer class of String, it is mutable in nature and it is thread safe class
   we can use it when we have multi threaded environment and shared object of string buffer i.e, used by mutiple thread.

 StringBuilder -- 
             StringBuilder in Java represents an alternative to String and StringBuffer Class
     as it creates a mutable sequence of characters and it is not thread safe. It is used only within the thread , 
     so there is no extra overhead , so it is mainly used for single threaded program.
 
 */
