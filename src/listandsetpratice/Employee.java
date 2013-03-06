package listandsetpratice;


public class Employee {
    private String empId;
    private String empName;
    private String empWorkState;

    public Employee(String empId, String empName, String empWorkState) {
        this.empId = empId;
        this.empName = empName;
        this.empWorkState = empWorkState;
    }
    
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpWorkState() {
        return empWorkState;
    }

    public void setEmpWorkState(String empWorkState) {
        this.empWorkState = empWorkState;
    }
}
