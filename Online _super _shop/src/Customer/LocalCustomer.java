package Customer;

public class LocalCustomer extends Customer {
int tax=8;

    @Override
    public int taxOfCustomer() {
        super.tax=this.tax;
        return super.taxOfCustomer();
    }
}
