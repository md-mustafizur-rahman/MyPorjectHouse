package Employee;

import InterfacePackage.IEmployee;

public class Manager extends Employee implements IEmployee {

    Double managerCommission;
    Manager(String empName, String empId, String empGender, int empAge, String empType) {
        super(empName, empId, empGender, empAge, empType);
    }

    // Method Overriding
    @Override
    public void giveEmployeeCommission(double total_Selling_Amount) {
        System.out.println(super.employeeName+" are a "+super.employeeType);
        System.out.println("Total selling amount is:  "+total_Selling_Amount);
        if (total_Selling_Amount<1000)
        {
            System.out.println(employeeName+" have 0 % Commission");
            employeeCommission=(0);
        }
       else if (total_Selling_Amount>1000)
        {
            System.out.println(super.employeeName+" have 10 % Commission");

        managerCommission=(total_Selling_Amount/10);
            super.employeeCommission=managerCommission;
        }
        else   if (total_Selling_Amount>5000)
        {
            System.out.println(super.employeeName+" have 25 % Commission");
            managerCommission=(total_Selling_Amount/25);
            super.employeeCommission=managerCommission;
        }
        else
        {
            System.out.println(super.employeeName+" have 40 % Commission");
            managerCommission=(total_Selling_Amount/40);
            super.employeeCommission=managerCommission;
        }
        System.out.println(super.employeeName+"'s Monthly salary is with Commission is: : "+(employeeSalary+employeeCommission));
        System.out.println("\n\n");
    }
    }

