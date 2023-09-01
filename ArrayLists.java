import java.util.ArrayList;
// for Srting ArrayList
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<Integer>();

        // add elements
        List.add(0);
        List.add(2);
        List.add(3);
        List.add(4);
         
       System.out.println(List);


       // get Elements
       int ele=List.get(3);
       System.out.println(ele);


       // add Elements in Between Ele
       List.add(1,1);
       System.out.println(List);

       // Removing Elements

       List.remove(3);
       System.out.println(List);

       // Set Element Changing elements
       List.set(0,5);
       System.out.println(List);

       // Size of Array List
       System.out.println(List.size());

       //Loops
       for(int i=0; i<List.size(); i++){
        System.out.print(List.get(i));
       }
          System.out.println();
       // Sorting Array List
       Collections.sort(List);
       System.out.println(List);

    }
}
