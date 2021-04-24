package Customer;



public class ForeignCustomer extends Customer {

    int tax=20;
    // Method Over Writing
    @Override
    public void checkValidPhoneNumber()
    {
        System.out.print("Enter Your Country Code: ");
        countryCode=input.nextLine();
        System.out.print("Enter The Phone Customer Number: "+countryCode+" ");
        customerPhoneNumber=input.nextLong();
        while (!(customerPhoneNumber>=1000000&&customerPhoneNumber<=999999999999L))
        {
            System.out.println("Enter The valid phone number : ");
            System.out.print(countryCode+" ");
            customerPhoneNumber=input.nextLong();

        }
    }

// // Method Over riding
    @Override
    public int taxOfCustomer() {
        System.out.println("You are Foreign Customer So have: "+tax+"% tax");
        return tax;

    }



}

