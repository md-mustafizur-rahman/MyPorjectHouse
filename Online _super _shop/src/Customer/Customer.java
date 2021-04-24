package Customer;

import InterfacePackage.ICustomer;

import java.util.Scanner;

public class Customer  implements ICustomer {

    protected String customerName, customerId,customerGender;
    protected  Long customerPhoneNumber;
    protected int customerAge;
    int tax=0;
    protected String countryCode="+880";
    Scanner input=new Scanner(System.in);

    public void checkValidPhoneNumber() {
        System.out.print("Enter The Phone Customer Number:+880 ");
        customerPhoneNumber=input.nextLong();
        while (!(customerPhoneNumber>=1300000000&&customerPhoneNumber<=1999999999))
        {
            System.out.println("Enter only BD valid Number: ");
            System.out.print("+880 ");
            customerPhoneNumber= input.nextLong();

        }
    }
   // method overriding
    @Override
    public int taxOfCustomer() {
        System.out.println("You are local Customer So have: "+tax+"% tax");
        return tax;

    }



    protected void setCustomerInfo() {
        System.out.println("\t\t\tCustomer \n\t\t================");
        System.out.print("Enter The Customer ID: ");
        customerId=input.nextLine();
        System.out.print("Enter The Customer  Name: ");
        customerName=input.nextLine();
        System.out.print("Enter The Customer Gender: ");
        customerGender=input.nextLine();
        System.out.print("Enter the Customer Age: ");
        customerAge=input.nextInt();
        input.nextLine();
//        System.out.print("Enter The Phone Customer Number:+880 ");
//        customerPhoneNumber=input.nextInt();
    }
// Method Over Loading
    protected void setCustomerInfo(String CountryName) {
        System.out.println("\t\t\tCustomer \n\t\t================");
        System.out.print("Enter The Customer ID: ");
        customerId=input.nextLine();
        System.out.print("Enter The Customer  Name: ");
        customerName=input.nextLine();
        System.out.print("Enter The Customer Gender: ");
        customerGender=input.nextLine();
        System.out.print("Enter the Customer Age: ");
        customerAge=input.nextInt();
        input.nextLine();

    }

   protected void displayCustomerInfo() {
        System.out.println("The Customer ID is: "+customerName);
        System.out.println("The Customer Name is: "+customerId);
        System.out.println("The Customer Gender is: "+customerGender);
        System.out.println("The Customer Age is: "+customerAge);
        System.out.println("The Customer Phone number is : "+countryCode+" "+customerPhoneNumber);
    }

    // Method Over Loading
    protected void displayCustomerInfo(String CountryName) {
        System.out.println("Your Country name is: "+CountryName);
        System.out.println("The Customer ID is: "+customerName);
        System.out.println("The Customer Name is: "+customerId);
        System.out.println("The Customer Gender is: "+customerGender);
        System.out.println("The Customer Age is: "+customerAge);
        System.out.println("The Customer Phone number is : "+countryCode+" "+customerPhoneNumber);

    }


    protected  long carryPhoneNumber()
    {
        return customerPhoneNumber;
    }
    // Send Country Code to the Main Function
    protected String sendCountryCode ()
    {
        return countryCode;
    }


}
