package Main;

import Customer.LocalCustomer;


public class SubsetOfLocalCustomer extends LocalCustomer {

    // call local customer to the set customer information
    @Override
    protected void setCustomerInfo() {
        System.out.println("You are the Local Customer");
        super.setCustomerInfo();
    }

    // carryPhone Number return because new need the phone for creating bkash account in the same number
    @Override
    protected long carryPhoneNumber() {
        return super.carryPhoneNumber();
    }

    @Override
    protected void displayCustomerInfo() {
        super.displayCustomerInfo();
    }


    @Override
    public int taxOfCustomer() {
        return super.taxOfCustomer();
    }

    @Override
    protected String sendCountryCode() {
        return super.sendCountryCode();
    }
}
