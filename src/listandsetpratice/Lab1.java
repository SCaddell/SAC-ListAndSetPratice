package listandsetpratice;

import java.util.ArrayList;
import java.util.List;

public class Lab1 {
    public static void main(String[] args) {
        String item1 = "skis";
        String item2 = "ski poles";
        String item3 = "ski boots";
        
        List skiItems = new ArrayList();
        skiItems.add(item1);
        skiItems.add(item2);
        skiItems.add(item3);
        
        for (int i = 0; i < skiItems.size(); i++) {
            String s = (String)skiItems.get(i);
            System.out.println(s);
        }
        
                
    }
}
