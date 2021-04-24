package Payment_System;

public class Nagad extends Bank{
    int cashBackAmount;
    @Override
    public void setBankName() {
        super.bankName="Nagad";
    }

    //method overriding

    @Override
    public int cashback() {
        cashBackAmount=50;
        System.out.println("You chose "+bankName+" So You have "+cashBackAmount+" %");
        return cashBackAmount;
    }
}
