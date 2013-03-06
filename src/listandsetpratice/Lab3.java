package listandsetpratice;

import java.util.ArrayList;
import java.util.List;

public class Lab3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("123", "Tom", "WI");
        Employee emp2 = new Employee("456", "Fred", "MA");
        Employee emp3 = new Employee("123", "Mary", "OH");
        Dog dog1 = new Dog("Fido", 3,"a");
        Dog dog2 = new Dog("Max", 2, "b");
        Dog dog3 = new Dog("Fido", 3, "a");
        
        List mixedList = new ArrayList();
        mixedList.add(emp1);
        mixedList.add(emp2);
        mixedList.add(emp3);
        mixedList.add(dog1);
        mixedList.add(dog2);
        mixedList.add(dog3);
        
        for (int i=0; i < mixedList.size(); i++) {
            Object obj = mixedList.get(i);
            if(obj instanceof Employee) {
                Employee employee = (Employee) obj;
                System.out.println(employee.getEmpName());
            }
            else {
                if(obj instanceof Dog) {
                    Dog dog = (Dog) obj;
                    System.out.println(dog.getName());
                }
                else {
                    System.out.println("Object not recognized");
                }
            }
        }
    }
}
