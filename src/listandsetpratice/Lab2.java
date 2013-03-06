package listandsetpratice;

import java.util.ArrayList;
import java.util.List;

public class Lab2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("123", "Tom", "WI");
        Employee emp2 = new Employee("456", "Fred", "MA");
        Employee emp3 = new Employee("123", "Mary", "OH");
        
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        
        for(Employee s : employees) {
            System.out.println(s.getEmpName());
        }
    }
}
