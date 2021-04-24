package Main;

import Employee.Admin;

public class SubsetOfAdmin extends Admin {

    public SubsetOfAdmin(String empName, String empId, String empGender, int empAge, String empType, int phoneNumber) {
        super(empName, empId, empGender, empAge, empType, phoneNumber);
    }



    @Override
    protected void giveEmployeeSalary() {
        super.giveEmployeeSalary();
    }

    @Override
    protected void giveManagerSalary() {
        super.giveManagerSalary();
    }

    @Override
    protected void setManagerCommission(double total_Selling_Amount) {
        super.setManagerCommission(total_Selling_Amount);
    }

    @Override
    protected void setEmployeeCommission(double total_Selling_Amount) {
        super.setEmployeeCommission(total_Selling_Amount);
    }

}
