public class Enhance_For_Loop {
    public static void main(String[] args) {
        
        int num[] = new int [4];  // Dynamic method
      
        num[0]=4;
        num[1]=6;
        num[2]=8;
        num[3]=20;

        for(int n:num){
            System.out.println(n);
        }
    }
}

/*
 
for (type var : array) {

    statements using var;

}

type:   The data type of the elements in the array or collection.
var:    The variable that holds the current element during each iteration.
array:  The array or collection being iterated over.

// it automatic manages the iterations according to the length...

 */