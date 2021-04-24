package Customer;

public class StareCustomer extends Customer{   // Method Over Writing
    int tax=0;
    protected int stareDiscount=20;
    // // Method Over Writing
    @Override
    public int taxOfCustomer() {
        if (tax==0)
        {
            System.out.println("You are Stare Customer So have: No tax Here Tax totally Free ");
        }

        return tax;

    }
    protected int  stareDiscount()
    {
        System.out.println("You are Our Stare Customer so You "+stareDiscount+" % Special Discount");
        return stareDiscount;
    }

}
