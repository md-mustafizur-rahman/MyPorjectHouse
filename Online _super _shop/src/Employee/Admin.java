package Employee;

import InterfacePackage.IEmployee;

public class Admin extends Employee implements IEmployee{

// This Constructors Only Public Constructors because this Constructors go to the main class
 public Admin(String empName, String empId, String empGender, int empAge, String empType,int phoneNumber) {
        super(empName, empId, empGender, empAge, empType,phoneNumber);
    }
   long phoneNumber;
//
//    public static void main(String[] args) {
//        Admin Mustafiz=new Admin("1","2","@",4,"@",2l);
//        Mustafiz.displayEmp();
//        Mustafiz.pavel.displayEmp();
//        Mustafiz.giveManagerSalary();
//        Mustafiz.setManagerCommission(2000);
//
//        Mustafiz.ashik.displayEmp();
//        Mustafiz.giveEmployeeSalary();
//        Mustafiz.setEmployeeCommission(2000);
//
//
//    }
    public void  displayEmp()
    {
        System.out.println("\t\t"+employeeType+"\n\t===================");
        System.out.println("Name: "+employeeName);
        System.out.println("ID is: "+employeeId);
        System.out.println("Gender: "+employeeGender);
        System.out.println("Age: "+employeeAge);
        phoneNumber=super.adminPhoneNumber;
        System.out.println("Phone Number:+880 "+phoneNumber);

    }

    // Admin can set employee information
   public Employee ashik=new Employee("Ashik","5005-04-02","Male",28,"Staff");
    public Manager pavel=new Manager("Pavel","1001-20-11","Male",40,"Manager");

    // Admin can also set salary to the employee
    protected void giveEmployeeSalary()
    {
       ashik.setEmployeeSalary(18000);


    }
    protected void giveManagerSalary()
    {
        pavel.setEmployeeSalary(42000);
    }

    protected void setManagerCommission(double total_Selling_Amount)
    {
        pavel.giveEmployeeCommission(total_Selling_Amount);
    }

    protected void  setEmployeeCommission(double total_Selling_Amount )
    {
        ashik.giveEmployeeCommission(total_Selling_Amount);

    }

}
