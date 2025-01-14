class Students {

    int roll;
    String name;
    int marks;
    
}




public class ArrayOf_Objects {
    public static void main(String[] args) {
        
     Students s1 = new Students();
     Students s2 = new Students();
     Students s3 = new Students();

      s1.roll=1;
      s1.name="Adarsh";
      s1.marks=98;

      
      s2.roll=2;
      s2.name="Avnish";
      s2.marks=93;

      
      s3.roll=3;
      s3.name="Nishant";
      s3.marks=48;


       Students student[] = new Students[3];

       student[0]=s1;
       student[1]=s2;
       student[2]=s3;

       for(Students st : student)
          System.out.println(st.roll + " : " + st.name + " : " + st.marks);
    }
}
