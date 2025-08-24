package DAY04;

public class Arrays {
    public static void main(String[] args) {
        
      int num[] = {3,7,9,12};  // traditional method 
                                                       // Single Dimensional DAY04.Arrays..
      int num1[] = new int [4];  // Dynamic method
      
      num1[0]=4;
      num1[1]=6;
      num1[2]=8;
      num1[3]=20;

      for(int i=0;i<4;i++){
       // System.out.println(num1[i]);

      }


      int arr [][] = new int[3][4];  //  2D Array

    //  (int)(Math.random()*10) // random function generates a randow value in double so here i am typecasting
                                // and it generates values in points so, if we wants output in single digit then we have to multiply by 10....    

       for(int i=0;i<3;i++){
          for(int j=0;j<4;j++){                // for 2D Array
             arr[i][j]=(int)(Math.random()*10);
        }
      }
                       


      int arr1[][] = new int[3][];  // Jagged Array where we can define that how much coloumn will be in every row..

      arr1[0] = new int[3];
      arr1[1] = new int[2];
      arr1[2] = new int[4];
      
      for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr1[i].length;j++){             // For Jagged Array
           arr1[i][j]=(int)(Math.random()*10);
      }
    }


    int arr3 [][][] = new int[3][4][5];  //  3D Array
   

      for(int i=0;i<3;i++){
        for(int j=0;j<4;j++){
       
          System.out.print(arr[i][j]+ " ");

        }
        System.err.println();
      }

      for(int n[]:arr){
        for(int m:n){
          System.out.print(m+" "); // Enhanced FOR LOOP ,, Checkout Enhance_For_Loop.java for details...
        }
        System.out.println();
      }

     
    }
}
