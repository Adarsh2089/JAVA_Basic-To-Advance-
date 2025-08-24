package DAY07.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class arrayList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        System.out.println(list);
        System.out.println(list.size()); // list.size() is used to find the size of list..

        list.addAll(list1);

        try {
            System.out.println(list.get(5));
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println(list.indexOf(4));

       // list.clear();

      //  list.set(0 ,12 );

        //list.add(0,13);

        ListIterator<Integer> itr	= list.listIterator(0);
        while(itr.hasNext()){
            System.out.print(" "+itr.next());
        }
    }
}

/*          • ArrayList	is an ordered collection and allow duplicates.
            • ArrayList	is	index-based.
            • Processing elements much faster	(index	based)
            • Insertions and Deletions are slower	(shifting	of	elements	takes	time)
*/


/*   Methods of ArrayList ----

   1) .add(element) - used to add an element in arraylist.
   2) .size() -  used to find the size of list
   3) .isEmpty() -  checks if list is empty or not
   4) .get(index) -  Returns the element at that index
   5) .add(index,element) -  used to add element at specific index and shift the remaining elemnts
   6) .clear()  - used to clear the ArrayList
   7) .contains(element) -  checks for is element is available or not
   8) .indexOf(element) -  returns index of that element
   9) .set(index,element) -  used to set element at specific index and doesn't shift the remaining elemnts
  10) .addAll(list1) - used to merge to lists
 */


/*
   Iteration Methods -

   1) for each loop - using this we can only move forward (zero - End)

    Syntax -
       for(datatype var :	Array/Collection ){
             statements	;
       }
    examp-
       for(Integer it : list ){
           System.out.println(it);
       }

   2) for loop - can move forward and backward both

    Syntax -
       for(int i=0 ; i<list.size();i++){
             statements	;
       }
    examp-
       for(int i=0 ; i<list.size();i++){
           System.out.println(list.get(i));
       }

    3) Iterator - Iterator providing methods to iterator on any	collection and  .iterator()	method	returns	Iterator object	of	any	collection

       Syntax -
          Iterator<Integer>	itr	=	list.iterator();
          while(itr.hasNext()){
            Integer	ele	= itr.next();
            System.out.println(ele);
          }

     4) ListIterator - Using List Iterator we can iterate elements in forward and backward both & from specific value also

     example -

        --forwards--
           ListIterator<Integer>itr	= list.listIterator(list.size());
              	while(itr.hasNext()){
                    System.out.println(itr.next());
                }
        --backward--
           ListIterator<Integer>itr = list.listIterator(list.size());
              	while(itr.hasPrevious()){
                    System.out.println(itr.previous());
                }

       --specified index--
           ListIterator<Integer>itr = list.listIterator(5);
              	while(itr.hasNext()){
                    System.out.println(itr.next());
                }
 */
