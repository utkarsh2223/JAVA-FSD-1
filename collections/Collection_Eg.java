package collections;
import java.util.ArrayList;
import java.util.Iterator;

public class Collection_Eg {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        // Add the elements in the list
        list.add("Utkarsh");
        list.add("Aman");
        list.add("Riya");
        list.add("Girja");
        list.add("Rishab");

        // Print the elements of the list using an iterator
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Remove an element from the list
        list.remove("Rishab");
        System.out.println("After removing an element: " + list);

        // Search for an element in the list
        boolean contains = list.contains("Riya");
        System.out.println("Is 'Riya' in the list? " + contains);

        // Get the size of the list
        int size = list.size();
        System.out.println("Size of the list: " + size);

        // Clear the list
        list.clear();
        System.out.println("After clearing the list: " + list);
    }
}

