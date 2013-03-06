package listandsetpratice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Stuart - HP AMD 10
 */
public class Example3 {
    
    public static void main(String[] args) {
        Dog dog1 = new Dog("Fido", 3,"a");
        Dog dog2 = new Dog("Max", 2, "b");
        Dog dog3 = new Dog("Fido", 3, "a");
        
        List dogs = new ArrayList();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        System.out.println(dogs.size());
        
        Set dogSet = new HashSet(dogs);
        dogs = new ArrayList<Dog>(dogSet);
        System.out.println(dogs.size());
    }
    
}
