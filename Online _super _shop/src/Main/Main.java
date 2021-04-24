package Main;

import java.util.Scanner;

public class Main {

    public static  void main(String[] args) {
        System.out.println("\n\t\t\t\t\t\tName: MD. Mustafizur Rahman\n\t\t\t\t\t\t\tID: 193-35-2918\n\t\t\t=============================================");
        System.out.print("\t\t\t#############################################");
        System.out.print("\n\t\t\t#\t\t\t\t\t\t\t\t\t\t\t#");
        System.out.print("\n\t\t\t#\t\tWelcome To DreamZone Super Shop \t#\n");
        System.out.print("\t\t\t#\t\t\t\t\t\t\t\t\t\t\t#");
        System.out.println("\n\t\t\t#############################################\n");
        Main main=new Main();
        Double myMoney;
        int bkashPin,selectCustomer=0;
        Scanner input=new Scanner(System.in);
        String count;
        long customerPhoneNumber;
        int moneyTax,stareDiscount = 0;
        String countryCode ;
        String countryName;
        int specialDiscount=0;
        //This variable carry cashback money;
        int cashback;
        System.out.println("What type of customer you are: ");
        System.out.println("1.Local Customer\n2.Stare Customer\n3.Foreign Customer");
        // type means you are what type of customer;
        System.out.print("Press: ");
        int select=input.nextInt();
       select=main.checkOptions(select);
        if (select==1)
        {
            //Customer means Local Customer
            // This Customer variable means local customer Object or this is Customer class object
            SubsetOfLocalCustomer customer=new SubsetOfLocalCustomer();
            customer.setCustomerInfo();
            // This is checkValidPhoneNumber method here i ma seating valid phone number
            customer.checkValidPhoneNumber();
            System.out.println("\t\t\t Customer Info\n\t\t=======================");
            customer.displayCustomerInfo();
            customerPhoneNumber= customer.carryPhoneNumber();
            moneyTax=customer.taxOfCustomer();
            countryCode=customer.sendCountryCode();
        }
     else if (select==2)
        {
            // Stare Customer means How have more Offer Customer
            // This Customer variable means Stare customer Object or this is Stare Customer class object
            SubsetOfStareCustomer customer=new SubsetOfStareCustomer();
            customer.setCustomerInfo();
            // This is checkValidPhoneNumber method here i ma seating valid phone number
            customer.checkValidPhoneNumber();
            System.out.println("\t\t\t Customer Info\n\t\t=======================");
            customer.displayCustomerInfo();
            customerPhoneNumber= customer.carryPhoneNumber();
            moneyTax=customer.taxOfCustomer();
            countryCode=customer.sendCountryCode();
            stareDiscount=customer.stareDiscount();
//            System.out.println("KKKKKKKKKK"+stareDiscount);
            selectCustomer=select;
        }
        else
        {
            SubsetOfForeignCustomer customer=new SubsetOfForeignCustomer();
            // This Customer variable means Foreign customer Object or this is Foreign customer class object
            System.out.println("You Are the customer of Foreign Country:\n================================");
            System.out.print("Enter your country name: ");
            input.nextLine();
            countryName=input.nextLine();
            while (countryName.equals("Bangladesh")||countryName.equals("bangladesh"))
            {
                System.out.println("\t\tYou Select Foreign Countries Customer So you can not to Select Bangladesh\n\t==============================================================================");
                System.out.print("Enter your country name again: ");
                countryName=input.nextLine();
                //countryCode Default== Bangladesh
                countryCode= customer.sendCountryCode();
            }
            customer.setCustomerInfo(countryName);
            // This is checkValidPhoneNumber method here i ma seating valid phone number
            customer.checkValidPhoneNumber();
            System.out.println("\t\t\t Customer Info\n\t\t=======================");
            customer.displayCustomerInfo(countryName);
            customerPhoneNumber= customer.carryPhoneNumber();
           moneyTax=customer.taxOfCustomer();
           countryCode=customer.sendCountryCode();
        }
        System.out.println("For Payment You have 3 Options");
        System.out.println("1.Islamic Bank\n2.Bkash\n3.Nagad");
        System.out.print("Press: ");
        select=input.nextInt();
        select=main.checkOptions(select);
        switch (select)
        {
            case 1:
                SubsetOfIslamicBank Bank= new SubsetOfIslamicBank();
                Bank.setBankName();
                Bank.createBankAccount(customerPhoneNumber,countryCode);
                cashback= Bank.cashback();
                myMoney= Bank.moneyCalculation(cashback);
                bkashPin=Bank.carryBankPin();
                break;
            case 2:
                SubsetOfBkash Bkash= new SubsetOfBkash();
                System.out.println("!!!!!");
                Bkash.setBankName();
                Bkash.createBankAccount(customerPhoneNumber,countryCode);
               cashback= Bkash.cashback();
                myMoney= Bkash.moneyCalculation(cashback);
                bkashPin=Bkash.carryBankPin();
                break;

            default:
                SubsetOfNagad Nagad= new SubsetOfNagad();
                Nagad.setBankName();
                Nagad.createBankAccount(customerPhoneNumber,countryCode);
                cashback=Nagad.cashback();
                myMoney= Nagad.moneyCalculation(cashback);
                bkashPin=Nagad.carryBankPin();
                break;
        }


        SubsetOfProduct thisProduct=new SubsetOfProduct();
        thisProduct.sendMoneyToTheProduct(myMoney,bkashPin);
        System.out.println("You Want to Buy some Product in Our Online Super Shop:yes/no ");
        input.nextLine();
        System.out.print("Press: ");
        count=input.nextLine();
        double bankMoney1=myMoney;
        // Here inserting zero because without zero make problem to the  ((( Mustafizur.setManagerCommission(priceOFProduct); ))))
        // without this methode running  ((( thisProduct.productCategory(stareDiscount); ))) priceOFProduct==Null
        //((( Mustafizur.setManagerCommission(priceOFProduct); )))) this methode can not be received null value
        // So i am inserting here priceOFProduct=0
        double priceOFProduct=0;
//        System.out.println("SELECT TTTTTTTT="+selectCustomer);
        while (count.equals("yes")||count.equals("y")||count.equals("YES")||count.equals("Yes")||count.equals("Y"))
        {
            if (selectCustomer==2)
            {
                priceOFProduct=thisProduct.productCategory(stareDiscount);
            }
            else
            {
                // specialDiscount This variable value = 0 it is ony use method overLoading
                priceOFProduct=thisProduct.productCategory(moneyTax,specialDiscount);
            }
//            double priceOFProduct=thisProduct.productCategory();
           bankMoney1=main.productMoneyTransaction(bankMoney1,bkashPin,priceOFProduct);
            System.out.println("You Want to Buy Any more Product in Our Online Super Shop:yes/no ");
            System.out.print("Press: ");
            count=input.nextLine();


        }
        SubsetOfAdmin Mustafizur= new SubsetOfAdmin("MD. Mustafizur Rahman","193-35-2918","Male",20,"Admin",1766563617);
        Mustafizur.displayEmp();

        // All things as like as object of Manager class and object of Employee create in Admin class
        //giveManagerSalary(); this methode insertemployee or manager  salary
        // Mustafizur.setManagerCommission(priceOFProduct); this methode give Commission to the employee and Manager  based on selling amount
        // Part of Manager
        Mustafizur.pavel.displayEmp();
        Mustafizur.giveManagerSalary();
        Mustafizur.setManagerCommission(priceOFProduct);

        // part Of Employee
        Mustafizur.ashik.displayEmp();
        Mustafizur.giveEmployeeSalary();;
        Mustafizur.setEmployeeCommission(priceOFProduct);


    }
    // this method check option number

   public int checkOptions(int select)
    {
        while (!(select==1||select==2||select==3))
        {
            System.out.println("Invalid Options: ");
            System.out.println("Enter Option Again");
            System.out.print("Press: ");
            Scanner input=new Scanner(System.in);
            select=input.nextInt();
        }
        return select;
    }

    // This methode calculate money transition process
   private double productMoneyTransaction(double bankMoney1,int bkashpin ,double productPrice) {
        Scanner input=new Scanner(System.in);
        System.out.println("My Bank Total Money: "+bankMoney1);
        System.out.println("My bkashPin: "+ bkashpin);
        System.out.print("Enter Your Bkash Account Pin Number: ");
        int pin=input.nextInt();
        while (bkashpin!=pin)
        {
            System.out.println("\t\t Wrong Pin\n\t===================");
            System.out.print("Enter Bkash Account correct Pin Number: ");
            pin=input.nextInt();
        }
        if (bankMoney1<productPrice)
        {
            System.out.println("Bank Money:"+bankMoney1);
            System.out.println("Product money:"+productPrice);
            System.out.println("\t\tInsufficient balance\t\n==========================================");
             return bankMoney1;
        }
        else
        {

            System.out.println("\t\tTransaction is complete\t\n==========================================");
            System.out.println("Bank Money:"+bankMoney1);
            bankMoney1=bankMoney1-productPrice;
            System.out.println("Product money:"+productPrice);
            System.out.println("Your Bank Remaining balance is: "+bankMoney1);
            return bankMoney1;


        }
    }

}
