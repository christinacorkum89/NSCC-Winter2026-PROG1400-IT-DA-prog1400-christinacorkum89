public class Department {
    protected String deptName;
    public String managerName;
    private int numOfEmployees;


    //2. Constructor(s):


    //Methods:
    //I will declare a setter method that is setting the value of the private
    // attribute in the same package, or the private/protected attribute in another package.


    public void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    //I will delcare a getter method that gets the value of any attribute.

    public int getNumOfEmployees() {
        return numOfEmployees;
    }
}
