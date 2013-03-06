package listandsetpratice;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Stuart Caddell, scaddell@my.wctc.edu
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        List groceryList = new ArrayList();
//        groceryList.add("Beer");
//        groceryList.add("Pizza");
//        groceryList.add("Chips");
//        String item = (String)groceryList.get(1);  // not best way to do this
        
//        for (int i=0; i < groceryList.size(); i++) {
//            String s = (String)groceryList.get(i);
//            System.out.println(s);
//        }
        
        
//        List <String> groceryList = new ArrayList<String>();
//        groceryList.add("Beer");
//        groceryList.add("Pizza");
//        groceryList.add("Chips");
//        String item = groceryList.get(1);  // better way to do this
//        
//        for(String s : groceryList) {
//            System.out.println(s);
//        }
//        
//        System.out.println(groceryList.size());
//        groceryList.remove(2);
//        System.out.println(groceryList.size());  
//        groceryList.add(1, "Beer Nuts");
//        for(String s : groceryList) {
//            System.out.println(s);
//        }
//        
//        System.out.println(groceryList.size());
//        System.out.println(groceryList.get(1));
        
        List <String> groceryList = new ArrayList<String>();
        groceryList.add("Beer");
        groceryList.add("Pizza");
        groceryList.add("Chips");
        groceryList.add("Beer");
        String item = groceryList.get(1);  // better way to do this
        
        for(String s : groceryList) {
            System.out.println(s);
        }
        
        System.out.println(groceryList.size());
        groceryList.remove(2);
        System.out.println(groceryList.size());  
        groceryList.add(1, "Beer Nuts");
        for(String s : groceryList) {
            System.out.println(s);
        }
        
        System.out.println(groceryList.size());
        System.out.println(groceryList.get(1));
        
        System.out.println("Index of Pizza = " + groceryList.indexOf("Pizza"));
        System.out.println("Index of Wine = " + groceryList.indexOf("Wine"));
        
        //System.out.println(groceryList.listIterator());
    }
}
