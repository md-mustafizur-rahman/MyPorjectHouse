package Payment_System;

public class Bkash extends Bank {
int  cashBackAmount;
    // method overriding
    @Override
    public void setBankName() {
        super.bankName="Bkash";
    }

    //method overriding


    @Override
    public int cashback() {
   cashBackAmount=25;
        System.out.println("You chose "+bankName+" So You have "+cashBackAmount+" %");

        return cashBackAmount;
    }
}
