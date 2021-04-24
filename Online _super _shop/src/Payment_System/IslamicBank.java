package Payment_System;

public class IslamicBank extends Bank{
    int cashBackAmount;
    @Override
    public int cashback() {
        cashBackAmount=2;
        System.out.println("You chose "+bankName+" So You have "+cashBackAmount+" %");
        return cashBackAmount;
    }
}
