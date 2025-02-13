package Java.CustomSort;

import java.lang.Comparable;

public class Employee implements Comparable<Employee> {
    private Integer empId;
    private String empName;
    private String empRole;
    private String officeLocation;

    public Employee() {}

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public Employee(int empId, String empName, String empRole, String officeLocation) {
        this.empId = empId;
        this.empName = empName;
        this.empRole = empRole;
        this.officeLocation = officeLocation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empRole='" + empRole + '\'' +
                ", officeLocation='" + officeLocation + '\'' +
                '}' +"\n";
    }

    @Override
    public int compareTo(Employee emp) {
        return this.getEmpName().compareTo(emp.getEmpName());
    }
}
