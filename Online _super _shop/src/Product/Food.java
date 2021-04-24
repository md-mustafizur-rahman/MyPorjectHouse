package Product;

import java.util.Scanner;

public class Food extends Product{
    int pisces=1;
Scanner input=new Scanner(System.in);

    // specialDiscount This variable value = 0 it is ony use method overLoading
     void setProduct(int tax, int specialDiscount) {
        System.out.println("\t\t\tFood \n\t\t================");
        System.out.println("1.Beef\n2.Fish\n3.7UP");
        System.out.print("Press: ");
        int value=input.nextInt();
        while (!(value==1||value==2||value==3))
        {

            System.out.println("Wrong Key");
            System.out.println("1.Beef\n2.Fish\n3.Vegetable");
            System.out.print("Press: ");
            value=input.nextInt();
        }
        System.out.print("How many Pisces You need: ");
         pisces=input.nextInt();
        switch (value)
        {
            case 1:
                setProduct("Beef","1010","Food",(550*pisces),pisces,discount,tax);
                break;
            case 2:
                setProduct("Fish","1011","Food",(350*pisces),pisces,discount,tax);
                break;
            case 3:
                setProduct("7UP","1012","Food",(120*pisces),pisces,discount,tax);
                break;
        }

    }

    //Method OverLoading

    void setProduct(int stareDiscount ) {
        System.out.println("You Are Stare Customer So You have 20 % Discount ");

        System.out.println("\t\t\tFood \n\t\t================");
        System.out.println("1.Beef\n2.Fish\n3.7UP");
        System.out.print("Press: ");
        int value=input.nextInt();
        while (!(value==1||value==2||value==3))
        {

            System.out.println("Wrong Key");
            System.out.println("1.Beef\n2.Fish\n3.Vegetable");
            System.out.print("Press: ");
            value=input.nextInt();
        }
        System.out.print("How many Pisces You need: ");
        pisces=input.nextInt();
        switch (value)
        {
            case 1:
                setProduct("Beef","1010","Food",(550*pisces),pisces,stareDiscount);
                break;
            case 2:
                setProduct("Fish","1011","Food",(350*pisces),pisces,stareDiscount);
                break;
            case 3:
                setProduct("7UP","1012","Food",(120*pisces),pisces,stareDiscount);
                break;
        }

    }



}
