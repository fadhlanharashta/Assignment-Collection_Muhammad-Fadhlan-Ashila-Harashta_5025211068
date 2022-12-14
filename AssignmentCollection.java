package assignment_collection;

/*Create 1 project that implements:

List
Set
Map
Linkedlist (Queue n Stack)
Do it yourself, upload to github, and submit your github link here
*/

import java.util.*;


public class Assignment_Collection {

    public static void main(String[] args) {
        
        System.out.println("LIST OF KRIEGSMARINE SHIPS IN WWII");
        System.out.println("\n");
        
        //LIST
        List<String> ships = new ArrayList<>();
 
        ships.add("1 Aircraft Carrier");
        ships.add("10 Capital Ship");
        ships.add("25 Destroyer");
        ships.add("200 Uboat");
 
        System.out.println("Ship Using List: ");
        for (String fruit : ships)
        {
            System.out.println(ships);
        }
        System.out.println("");
        
        //using LinkedList (Stack)
        LinkedList<String> linkedListStack = new LinkedList<String>();
        linkedListStack.add("1 Aircraft Carrier");
        linkedListStack.add("10 Capital Ship");
        linkedListStack.add("25 Destroyer");
        linkedListStack.add("200 Uboat");
        System.out.println("Ship Using LinkedList Stack");
        System.out.println(linkedListStack);
        System.out.println("\n");
        
        //using LinkedList (queue)
        LinkedList<String> linkedListQueue = new LinkedList<String>();
        linkedListQueue.add("1 Aircraft Carrier");
        linkedListQueue.add("10 Capital Ship");
        linkedListQueue.add("25 Destroyer");
        linkedListQueue.add("200 Uboat");
        System.out.println("Ship Using LinkedList Queue");
        System.out.println(linkedListQueue);
        System.out.println("\n");
        
        //Set
        Set<String> Set = new HashSet<String>();
        Set.add("1 Aircraft Carrier");
        Set.add("10 Capital Ship");
        Set.add("25 Destroyer");
        Set.add("200 Uboat");
        
        System.out.println("Ship Using Set:");
        System.out.println(Set);
        System.out.println("");
        
        //using Map
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "1 Aircraft Carrier");
        map.put(2, "10 Capital Ship");
        map.put(3, "25 Destroyer");
        map.put(4, "200 Uboat");
 
        System.out.println("Ship Using Map:");
        for (Map.Entry m : map.entrySet())
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("");
        
        
 
    }
}