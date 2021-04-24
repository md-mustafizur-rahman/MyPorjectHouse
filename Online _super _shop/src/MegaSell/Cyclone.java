package MegaSell;



public class Cyclone extends MegaSell{
     String eventName="Cyclone";
    @Override
    protected void showEventInformation() {

        super.discountAmountOfEvent=80;
        System.out.print("\t\t\t#############################################");
        System.out.print("\n\t\t\t#\t\t\t\t\t\t\t\t\t\t\t#");
        System.out.print("\n\t\t\t#\t\t\t       "+eventName+"  \t\t\t\t#\n");
        System.out.print("\t\t\t#\t\t\t\t\t\t\t\t\t\t\t#");
        System.out.println("\n\t\t\t#############################################\n");
        showSponsorName();
        System.out.println("Cyclone Give us "+discountAmountOfEvent+" % Discount of all product in Our Super Shop");
        System.out.println(">>>>>>Product Delivery Duration 40 Working Day<<<<<<<");
        System.out.println("======================================================================\n");

    }

    @Override
    protected double setEventDiscount() {

        return super.discountAmountOfEvent;
    }
}
