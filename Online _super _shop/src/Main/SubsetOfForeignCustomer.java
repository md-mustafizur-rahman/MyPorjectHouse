package Main;

import Customer.ForeignCustomer;

public class SubsetOfForeignCustomer extends ForeignCustomer {
    // call Foreign customer to the set customer information
    @Override
    protected void setCustomerInfo() {
        System.out.println("You are the Foreign Customer:\n================================");
        super.setCustomerInfo();
    }



   // Methode overLoading
    @Override
    protected void setCustomerInfo(String CountryName) {
        super.setCustomerInfo(CountryName);
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

// Method overloading

    @Override
    protected void displayCustomerInfo(String CountryName) {
        super.displayCustomerInfo(CountryName);
    }

    @Override
    protected String sendCountryCode() {
        return super.sendCountryCode();
    }

    @Override
    public int taxOfCustomer() {
        return super.taxOfCustomer();
    }
}
