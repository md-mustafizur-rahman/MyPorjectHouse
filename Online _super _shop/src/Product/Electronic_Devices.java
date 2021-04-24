package Product;

import java.util.Scanner;

public class Electronic_Devices extends Product{
    int pisces=1;
    Scanner input=new Scanner(System.in);
   void setProduct() {
        System.out.println("\t\t\tElectronic Device \n\t\t=========================");
        System.out.println("1.Laptop\n2.Smart Phone\n3.TV");
        System.out.print("Press: ");
        int value=input.nextInt();
        while (!(value==1||value==2||value==3))
        {

            System.out.println("Wrong Key");
            System.out.println("1.Laptop\n2.Smart Phone\n3.TV");
            System.out.print("Press: ");
            value=input.nextInt();
        }
        System.out.print("How many Pisces You need: ");
        pisces=input.nextInt();
        switch (value)
        {
            case 1:
                setProduct("Laptop","3010","Electronic Device",(60000*pisces),pisces,discount);
                break;
            case 2:
                setProduct("Smart Phone","3011","Electronic Device",(180000*pisces),pisces,discount);
                break;
            case 3:
                setProduct("TV","3012","Electronic Device",(360000*pisces),pisces,discount);
                break;
        }

    }


    // Method Overloading

    void setProduct(int stareDiscount) {
        System.out.println("You Are Stare Customer So You have 60 % Discount ");
        System.out.println("\t\t\tElectronic Device \n\t\t=========================");
        System.out.println("1.Laptop\n2.Smart Phone\n3.TV");
        System.out.print("Press: ");
        int value=input.nextInt();
        while (!(value==1||value==2||value==3))
        {

            System.out.println("Wrong Key");
            System.out.println("1.Laptop\n2.Smart Phone\n3.TV");
            System.out.print("Press: ");
            value=input.nextInt();
        }
        System.out.print("How many Pisces You need: ");
        pisces=input.nextInt();
        switch (value)
        {
            case 1:
                setProduct("Laptop","3010","Electronic Device",(60000*pisces),pisces,stareDiscount);
                break;
            case 2:
                setProduct("Smart Phone","3011","Electronic Device",(180000*pisces),pisces,stareDiscount);
                break;
            case 3:
                setProduct("TV","3012","Electronic Device",(360000*pisces),pisces,stareDiscount);
                break;
        }

    }


}
