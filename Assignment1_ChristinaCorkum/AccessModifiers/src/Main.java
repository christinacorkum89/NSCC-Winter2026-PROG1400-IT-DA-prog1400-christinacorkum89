import Classes.Employee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Employee yousef = new Employee();
    Department accountingDept = new Department();
    accountingDept.deptName = "Accounting";
    accountingDept.managerName = "Brad";
//    accountingDept.numOfEmployees = 40;
    System.out.println(accountingDept.deptName);//Protected
    System.out.println(accountingDept.managerName); //public
//    System.out.println(accountingDept.numOfEmployees); //private
    accountingDept.setNumOfEmployees(40);
//    System.out.println(accountingDept.numOfEmployees); //private
    System.out.println(accountingDept.getNumOfEmployees());

    yousef.address = "Halifax";
    System.out.println(yousef.address);
//    System.out.println(yousef.name); //Protected in another package(folder)
//    System.out.println(yousef.salary);//Private in another package(folder)





}
