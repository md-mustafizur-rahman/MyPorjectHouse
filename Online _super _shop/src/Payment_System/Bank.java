package Payment_System;

import InterfacePackage.IBank;

import java.util.Scanner;

public class Bank implements IBank {
    protected long BankAccountNumber;
    protected int BankPin;
    protected Double BankAmount;
 public String bankName;
 //  cashBackAmount of May be Un
 int cashBackAmount;
    double cashBackMoney;
    Scanner input=new Scanner(System.in);


  protected long checkValidPhoneNumber(long number)
    {

        while (!(number>=1300000000&&number<=1999999999))
        {
            System.out.println("Enter only BD valid Number: ");
            System.out.print("+880 ");
            number=input.nextInt();
        }
        return number;
    }

    // Method Overloading
    protected  long checkValidPhoneNumber(long number, String countryCode)
    {

        while (!(number>=1000000&&number<=999999999999L))
        {
            System.out.println("Enter The valid phone number : ");
            System.out.print(countryCode+" ");
            number=input.nextInt();

        }
       return number;
    }
    @Override
    public void createBankAccount(long phoneNumber, String countryCode) {
        System.out.println("\t\t\tBank \n\t\t================");
        System.out.println("If you are create "+bankName+" Account in your phone number:+ "+countryCode+" "+phoneNumber+" Press 'yes'");
        System.out.println("For choosing Another phone number press: 'no'");
        System.out.print("Press:");
        String check;
        check=input.nextLine();
        if (check.equals("yes")||check.equals("y")||check.equals("YES")||check.equals("Y"))
        {
            System.out.println("Your "+bankName+" account number is: "+countryCode+" "+phoneNumber);
            System.out.print("set new 4 digit pin number: ");
            int pin1,pin2;
            pin1=input.nextInt();
            System.out.print("confirm pin: ");
            pin2=input.nextInt();
            while (!(pin1==pin2&& pin1>999&&pin1<10000))
            {
               if (!(pin2>999&&pin2<10000))
               {
                   System.out.println("!!!!! Enter a 4 digit code : ");
               }
               else
               {
                   System.out.println("Those passwords didn’t match. Try again.");
               }

                System.out.print("set new 4 digit pin number: ");
                pin1=input.nextInt();
                System.out.print("confirm pin: ");
                pin2=input.nextInt();
            }
            BankPin=pin2;
        }

        else if (check.equals("no")||check.equals("n")||check.equals("NO")||check.equals("n"))
        {
            System.out.print("Enter New phone number for Creating "+bankName+" Account: "+countryCode+" ");
            phoneNumber=input.nextLong();
            BankAccountNumber=phoneNumber;
            if (countryCode.equals("+880"))
            {
                phoneNumber=checkValidPhoneNumber(phoneNumber);
            }
            else
            {
                phoneNumber=checkValidPhoneNumber(phoneNumber,countryCode);
            }
            System.out.println("Your Bank account number is: "+countryCode+" "+phoneNumber);
            System.out.print("set new 4 digit pin number: ");
            int pin1,pin2;
            pin1=input.nextInt();
            System.out.print("confirm pin: ");
            pin2=input.nextInt();
            while (!(pin1==pin2&& pin1>999&&pin1<10000))
            {
                if (!(pin2>999&&pin2<10000))
                {
                    System.out.println("!!!!! Enter a 4 digit code : ");
                }
                else
                {
                    System.out.println("Those passwords didn’t match. Try again.");
                }

                System.out.print("set new 4 digit pin number: ");
                pin1=input.nextInt();
                System.out.print("confirm pin: ");
                pin2=input.nextInt();
            }
            BankPin=pin2;
        }
    }




    @Override
    public Double moneyCalculation(int cashBack) {
        System.out.print("Insert Money  in your Account:");
        BankAmount=input.nextDouble();
        System.out.println("Your "+bankName+" Your Inserting Money Amount is: "+BankAmount+" tk");
        cashBackMoney=(BankAmount*cashBack)/100;
        System.out.println("Your CashBack Amount is: "+cashBackMoney+" tk" );
        BankAmount=BankAmount+cashBackMoney;
        System.out.println("Your Total Bank Money is: "+BankAmount+" tk");
        return BankAmount;
    }

    @Override
    public void setBankName() {
        bankName="Islamic Bank";
    }

    @Override
    public int cashback() {
      cashBackAmount=0;
      System.out.println("You chose "+bankName+" So You have "+cashBackAmount+" %");
        return cashBackAmount;
    }


    protected int carryBankPin()
    {
        System.out.println();
        return BankPin;
    }
}
