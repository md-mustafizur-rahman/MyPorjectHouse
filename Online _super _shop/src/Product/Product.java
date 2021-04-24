package Product;

import InterfacePackage.IProduct;

import java.util.Scanner;

public class Product implements IProduct {
    protected int check;
    protected double basedInTax;
    protected double productPrice,myBankMoney;
    protected int myBkashPin,tax;
    protected double productDiscount,productTax,MegaSellDiscount=0,MegaSellDiscountMoney=0;
      protected int  discount;
      protected  double sendBillToMain,stareCustomerBillSend,payablePrice;
    protected String productName,productId,productCategory,eventName="3";
    int productQuantity;
    Scanner input= new Scanner(System.in);
    protected void  sendMoneyToTheProduct(double bankMoney1,int bkashpin)
    {
        myBankMoney=bankMoney1;
        myBkashPin=bkashpin;

    }


    // specialDiscount This variable value = 0 it is ony use method overLoading
    @Override
    public double productCategory( int tax, int specialDiscount) {
        System.out.println("1.Food\n2.Fashion\n3.Electronic Devices");
        System.out.print("Press: ");
        check=input.nextInt();
        while (!(check==1||check==2||check==3))
        {

            System.out.println("Check=="+check);
            System.out.println("Wrong Key");
            System.out.println("1.Food\n2.Fashion\n3.Electronic Devices");
            System.out.print("Press: ");
            check=input.nextInt();
        }
        switch (check)
        {
            case 1: {
                Food myFood=new Food();
                myFood.setProduct(tax,specialDiscount);
                myFood.ProductValueDisplay();
                return myFood.sendBillToMain;
            }
            case 2: {
                Fashion myFashion=new Fashion();
                myFashion.setProduct();
                myFashion.ProductValueDisplay();
                return myFashion.sendBillToMain;

            }
            default: {
                Electronic_Devices myDevice=new Electronic_Devices();
                myDevice.setProduct();
                myDevice.ProductValueDisplay();
                return myDevice.sendBillToMain;
            }
        }
    }
// Method OverLoading
    public double productCategory(int stareDiscount ) {
        System.out.println("1.Food\n2.Fashion\n3.Electronic Devices");
        System.out.print("Press: ");
        check=input.nextInt();
        while (!(check==1||check==2||check==3))
        {

            System.out.println("Check=="+check);
            System.out.println("Wrong Key");
            System.out.println("1.Food\n2.Fashion\n3.Electronic Devices");
            System.out.print("Press: ");
            check=input.nextInt();
        }
        switch (check)
        {
            case 1: {
                Food myFood=new Food();
                myFood.setProduct(stareDiscount);
                myFood.ProductValueDisplay();
                return myFood.stareCustomerBillSend;
            }
            case 2: {
                Fashion myFashion=new Fashion();
                myFashion.setProduct(stareDiscount);
                myFashion.ProductValueDisplay();
                return myFashion.stareCustomerBillSend;

            }
            default: {
                Electronic_Devices myDevice=new Electronic_Devices();
                myDevice.setProduct(stareDiscount);
                myDevice.ProductValueDisplay();
                return myDevice.stareCustomerBillSend;
            }
        }
    }



    @Override
    public void setProduct(String name, String id, String category, double price, int quantity,int moneyDiscount,int tax )
    {
//        System.out.println("ttttttttttttttttttttt");
        productName=name;
        productId=id;
        productCategory=category;
        productPrice=price;
        productQuantity=quantity;
        productDiscount=(price*moneyDiscount)/100;
        discount=moneyDiscount;
        this.tax=tax;
        productTax=((price-productDiscount)*tax)/100;
        basedInTax=price-productDiscount;
        payablePrice=productPrice-productDiscount;
        System.out.println("Now Running two event ");
        System.out.println("1.Cyclone\n2.FlashSell\n3.Nothing ");
        System.out.print("Press: ");
        int number = input.nextInt();
//        number = checkOptions(number);

        if (number == 1) {
            eventName = "Cyclone";
            payablePrice=callEvent(payablePrice,eventName);
        } else if(number==2) {
            eventName = "FlashSell";
            payablePrice=callEvent(payablePrice,eventName);

        }
        payablePrice=payablePrice+productTax;
    }

    // Method Overloading
// Here i am remove tax variable
    public void setProduct(String name, String id, String category, double price, int quantity,int moneyDiscount ) {

        productName = name;
        productId = id;
        productCategory = category;
        productPrice = price;
        productQuantity = quantity;
        productDiscount = (price * moneyDiscount) / 100;
        discount = moneyDiscount;
//        System.out.println("PPPPPPPPPP"+productDiscount);
        payablePrice = productPrice - productDiscount;
        System.out.println("Now Running two event ");
        System.out.println("1.Cyclone\n2.FlashSell\n3.Nothing ");
        System.out.print("Press: ");
        int number = input.nextInt();
        if (number == 1) {
            eventName = "Cyclone";
            payablePrice=callEvent(payablePrice,eventName);
        } else if(number==2) {
            eventName = "FlashSell";
            payablePrice=callEvent(payablePrice,eventName);

        }
    }

//    public static void main(String[] args) {
//        Product p=new Product();
//        p.callEvent(400000,"Cyclone");
//    }








double callEvent(double payablePrice,String eventName)
{
    if (eventName.equals("Cyclone"))
    {
        SubsetOfCyclone cyclone = new SubsetOfCyclone();
        cyclone.showEventInformation();
        input.nextLine();
        System.out.println("Are You Continue with cyclone Yes or No");
        System.out.print("Press: ");
        String check = input.nextLine();
        if (check.equals("yes") || check.equals("Yes") || check.equals("YES")||check.equals("y")||check.equals("Y")) {
            MegaSellDiscount=cyclone.setEventDiscount();
            MegaSellDiscountMoney=(payablePrice * MegaSellDiscount) / 100;
            payablePrice = payablePrice-MegaSellDiscountMoney;
        }
        return payablePrice;
    }
    else
    {
        SubsetOfFlashSell flashSell = new SubsetOfFlashSell();
        input.nextLine();
        flashSell.showEventInformation();
        System.out.println("Are You Continue with cyclone Yes or No");
        System.out.print("Press: ");
        String check = input.nextLine();
        if (check.equals("yes") || check.equals("Yes") || check.equals("YES")||check.equals("y")||check.equals("Y")) {
            MegaSellDiscount=flashSell.setEventDiscount();
            MegaSellDiscountMoney=(payablePrice * MegaSellDiscount) / 100;
            payablePrice = productPrice-MegaSellDiscountMoney;
        }
        return payablePrice;
    }
}


    @Override
    public void ProductValueDisplay() {
        System.out.println("The productID: "+productId);
        System.out.println("The productName: "+productName);
        System.out.println("The productCategory: "+productCategory);
        System.out.println("A pieces/kg of product price is: "+(productPrice/productQuantity));
        System.out.println("Product Quantity is: "+productQuantity);
        System.out.println("Your Discount is: "+discount+" %");
        System.out.println("You have Discount : "+productDiscount);
        System.out.println("Total price of product is: "+productPrice+" Tk");
        System.out.println("Total Price With Discount : "+(productPrice-productDiscount) );
        if (eventName.equals("Cyclone"))
        {
            System.out.println("\n");
            System.out.println("Congratulation You are selecting in Cyclone So You have "+MegaSellDiscount+" % Discount for all product");
            System.out.println("Cyclone Discount Amount is: "+MegaSellDiscountMoney);
            System.out.println("Your For Cyclone Payable Price is: "+payablePrice);
            System.out.println("\n");
        }

        else if (eventName.equals("FlashSell"))
        {
            System.out.println("\n");
            System.out.println("Congratulation You are selecting in FlashSell So You have "+MegaSellDiscount+" % Discount for all product");
            System.out.println("Flash Discount Amount is: "+MegaSellDiscountMoney);
            System.out.println("Your For FlashSell Payable Price is: "+payablePrice);
            System.out.println("\n");
        }

        System.out.println("\n");
        System.out.println("Tax Not compare With Mega Sell Discount ");
         System.out.println("You have tax "+tax+" %"+"based in Genuine Product Price "+basedInTax+" tax amount is: "+productTax);
            System.out.println("Your Total Payable Price is: "+payablePrice);
        System.out.println("\n");



        // stareCustomerBillSend This variable carry stare Customer product buying money
//        stareCustomerBillSend=productPrice-productDiscount;
        stareCustomerBillSend=payablePrice;



        //  sendBillToMain This variable carry Foreign Customer and local customer product buying money
        // Here i am using sendBillToMain because local customer and foreign customer has tax
        sendBillToMain=stareCustomerBillSend+productTax;

        System.out.println("Your Payable Price is with Tax: "+sendBillToMain);
    }



    public int checkOptions(int select) {
        while (!(select==1||select==2||select==3))
        {
            System.out.println("Invalid Options: ");
            System.out.println("Enter Option Again");
            System.out.print("Press: ");
            Scanner input=new Scanner(System.in);
            select=input.nextInt();
        }
        return 0;
    }
}
