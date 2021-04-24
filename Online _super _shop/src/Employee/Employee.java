package Employee;

import InterfacePackage.IEmployee;

 public class Employee implements IEmployee {
    protected  String employeeName,employeeId,employeeGender,employeeType;
    protected  int employeeAge;
    public double employeeSalary;
    public double employeeCommission;
    long adminPhoneNumber;
 public Employee(String empName,String empId,String empGender,int empAge,String empType)
    {
        employeeName=empName;
        employeeId=empId;
        employeeGender=empGender;
        employeeAge=empAge;
        employeeType=empType;
    }

    // Method Overriding
    Employee(String empName,String empId,String empGender,int empAge,String empType,int phoneNumber)
    {
        employeeName=empName;
        employeeId=empId;
        employeeGender=empGender;
        employeeAge=empAge;
        employeeType=empType;
        adminPhoneNumber=phoneNumber;
    }



 public void  displayEmp()
    {
        System.out.println("\n");
        System.out.println("\t\t"+employeeType+"\n\t===================");
        System.out.println("Name: "+employeeName);
        System.out.println("ID is: "+employeeId);
        System.out.println("Gender: "+employeeGender);
        System.out.println("Age: "+employeeAge);


    }


    @Override
    public void setEmployeeSalary(double salary) {
        System.out.println(employeeName+" are a "+employeeType);
        System.out.println(employeeName+" Monthly salary is:" +salary+"Tk");
        employeeSalary=salary;
    }
// Method Overriding
    @Override
    public void giveEmployeeCommission(double total_Selling_Amount) {
        System.out.println(employeeName+" are a "+employeeType);
        System.out.println("Total selling amount is:  "+total_Selling_Amount);
        if (total_Selling_Amount<1000)
        {
            System.out.println(employeeName+" have 0 % Commission");
            employeeCommission=(0);
        }
        else if (total_Selling_Amount>1000)
        {
            System.out.println(employeeName+" have 5 % Commission");
            employeeCommission=(total_Selling_Amount/10);
        }
        else   if (total_Selling_Amount>5000)
        {
            System.out.println(employeeName+" have 10 % Commission");
            employeeCommission=(total_Selling_Amount/15);
        }
        else
        {
            System.out.println(employeeName+" have 20 % Commission");
            employeeCommission=(total_Selling_Amount/20);
        }
        System.out.println(employeeName+"'s Monthly salary is with Commission is: : "+(employeeSalary+employeeCommission));
        System.out.println("\n\n");
    }
}
