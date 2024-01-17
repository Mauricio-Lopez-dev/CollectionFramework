/*
 * Author: Mauricio Lopez Alvarez                                    **
 * Date written: January 17th, 2024                                  **
 * Purpose:... Homework 2 - Collections Framework                    **
 * ........... Learn more about the Collection framework by creating **
 * ........... an array of doubles, sorting then searching an array  **
 */
package cop2805;
import java.util.*;

public class CollectionFramework 
{
    public static void main(String[] args) 
    {
        // Variables
        int result;
        ArrayList<Double> list = new ArrayList<Double>();
        list.add(1.5);
        list.add(2.35);
        list.add(-4.7);
        list.add(0.01);
        
        // Output - Original List
        System.out.println("Original List:");
        printArray(list);
        
        // Calling sort Method
        Collections.sort(list);
        
        // Output - Sorted List
        System.out.println("\nSorted List:");
        printArray(list);
       
        // Calling binarySearch Method
        result = Collections.binarySearch(list, 1.5);
        
        // Validation
        if(result== -1)
        {
            // Output
            System.out.println("\nElement cannot be found.");
        }
        else
        {
            // Output
            System.out.println("\nFound 1.5 at index " + result);
        }
        
        // Output - Zero List
        System.out.println("Zero List: ");
        for(int i = 0; i < list.size(); i++)
        {
            // Replacing All Values
            list.set(i, 0.00);
        }
        printArray(list);
        
       
        
    } // end main
    
    public static void printArray(ArrayList list)
    {
        // Output
        for(Object obj: list)
        {
            System.out.println(obj);
        }
    } // end printArray method
    
    
} // end CollectionFramework class
