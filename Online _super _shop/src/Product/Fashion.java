package Product;

import java.util.Scanner;

public class Fashion extends Product {
    Scanner input=new Scanner(System.in);
    int pisces=1;
    void setProduct() {
        System.out.println("\t\t\tFashion \n\t\t================");
        System.out.println("1.Male\n2.Female");
        System.out.print("Press:");
        int value1=input.nextInt();
        while (!(value1==1||value1==2))
        {

            System.out.println("Wrong Key");
            System.out.println("1.Male\n2.Female");
            System.out.print("Press: ");
            value1=input.nextInt();
        }
        if (value1==1)
        {
            System.out.println("\t\tMale \n\t================");
            System.out.println("1.Jeans\n2.T-Shirts\n3.Shoes");
            System.out.print("Press: ");
            int value=input.nextInt();
            while (!(value==1||value==2||value==3))
            {

                System.out.println("Wrong Key");
                System.out.println("1.Jeans\n2.T-Shirts\n3.Shoes");
                System.out.print("Press: ");
                value=input.nextInt();
            }
            System.out.print("How many Pisces You need: ");
             pisces=input.nextInt();
            switch (value)
            {
                case 1:
                    setProduct("Jeans","2010","Fashion",(1200*pisces),pisces,discount);
                    break;
                case 2:
                    setProduct("T-Shirts","2011","Fashion",(600*pisces),pisces,discount);
                    break;
                case 3:
                    setProduct("Shoes","2012 ","Fashion",(950*pisces),pisces,discount);
                    break;
            }
        }
        else if (value1==2)
        {
            System.out.println("\t\tFemale \n\t================");
            System.out.println("1.Saree\n2.Tops\n3.Kurti");
            System.out.print("Press: ");
            int value=input.nextInt();
            while (!(value==1||value==2||value==3))
            {

                System.out.println("Wrong Key");
                System.out.println("1.Saree\n2.Tops\n3.Kurti");
                System.out.print("Press: ");
                value=input.nextInt();
            }
            System.out.print("How many Pisces You need: ");
             pisces=input.nextInt();
            switch (value)
            {
                case 1:
                    setProduct("Saree","2013","Fashion",(1800*pisces),pisces,discount);
                    break;
                case 2:
                    setProduct("Tops","2014","Fashion",(1500*pisces),pisces,discount);
                    break;
                case 3:
                    setProduct("Kurti","2015","Fashion",(999*pisces),pisces,discount);
                    break;
            }
        }


    }

    // Method Overloading


    void setProduct(int stareDiscount ) {
        System.out.println("You Are Stare Customer So You have 60 % Discount ");
        System.out.println("\t\t\tFashion \n\t\t================");
        System.out.println("1.Male\n2.Female");
        System.out.print("Press:");
        int value1=input.nextInt();
        while (!(value1==1||value1==2))
        {

            System.out.println("Wrong Key");
            System.out.println("1.Male\n2.Female");
            System.out.print("Press: ");
            value1=input.nextInt();
        }
        if (value1==1)
        {
            System.out.println("\t\tMale \n\t================");
            System.out.println("1.Jeans\n2.T-Shirts\n3.Shoes");
            System.out.print("Press: ");
            int value=input.nextInt();
            while (!(value==1||value==2||value==3))
            {

                System.out.println("Wrong Key");
                System.out.println("1.Jeans\n2.T-Shirts\n3.Shoes");
                System.out.print("Press: ");
                value=input.nextInt();
            }
            System.out.print("How many Pisces You need: ");
            pisces=input.nextInt();
            switch (value)
            {
                case 1:
                   setProduct("Jeans","2010","Fashion",(1200*pisces),pisces,stareDiscount);
                    break;
                case 2:
                    setProduct("T-Shirts","2011","Fashion",(600*pisces),pisces,stareDiscount);
                    break;
                case 3:
                    setProduct("Shoes","2012 ","Fashion",(950*pisces),pisces,stareDiscount);
                    break;
            }
        }
        else if (value1==2)
        {
            System.out.println("\t\tFemale \n\t================");
            System.out.println("1.Saree\n2.Tops\n3.Kurti");
            System.out.print("Press: ");
            int value=input.nextInt();
            while (!(value==1||value==2||value==3))
            {

                System.out.println("Wrong Key");
                System.out.println("1.Saree\n2.Tops\n3.Kurti");
                System.out.print("Press: ");
                value=input.nextInt();
            }
            System.out.print("How many Pisces You need: ");
            pisces=input.nextInt();
            switch (value)
            {
                case 1:
                    setProduct("Saree","2013","Fashion",(1800*pisces),pisces,stareDiscount);
                    break;
                case 2:
                    setProduct("Tops","2014","Fashion",(1500*pisces),pisces,stareDiscount);
                    break;
                case 3:
                    setProduct("Kurti","2015","Fashion",(999*pisces),pisces,stareDiscount);
                    break;
            }
        }


    }

}
