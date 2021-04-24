package MegaSell;

import com.sun.jdi.Value;

import java.util.Random;

public abstract class MegaSell {
    protected String sponsorName;
    protected int deliveryDuration;
    protected double discountAmountOfEvent;
    protected String EventName;

    protected abstract void showEventInformation();

    void showSponsorName() {
//public static void main(String[] args) {
        String sponsorName;

        Random rand = new Random();
        int value = rand.nextInt(11) + 1;
//        System.out.println(value);
        // Here Sponsor Name change in randomLly
        if (value == 1) {
            sponsorName = "SAMSUNG\t";
        } else if (value == 2) {
            sponsorName = "WALTON\t";
        } else if (value == 3) {
            sponsorName = "Daffodil";
        } else if (value == 4) {
            sponsorName = "HUNDA\t";
        } else if (value == 5) {
            sponsorName = "LG\t\t";
        } else if (value == 6) {
            sponsorName = "amazon\t";
        } else if (value == 7) {
            sponsorName = "Microsoft";
        } else if (value == 8) {
            sponsorName = "Apple\t";
        } else if (value == 9) {
            sponsorName = "TOYOTA\t";
        } else if (value == 10) {
            sponsorName = "Facebook";
        } else {
            sponsorName = "Google\t";
        }


        System.out.print("\t\t\t#############################################");
        System.out.print("\n\t\t\t#\t\t\tSponsor Name : " + sponsorName + " \t\t#");
        System.out.println("\n\t\t\t#############################################\n");
    }
//    }

    protected abstract double setEventDiscount();
}
