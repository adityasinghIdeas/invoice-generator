package core.impl;

import core.Accommodation;
import core.BillGenerationFactory;
import core.Billing;
import core.OpenAccommodation;
import model.BillInput;
import model.BillType;

public class BillGenerator {

    public void generateBill(BillInput billInput){

        Billing meal =  BillGenerationFactory.getBillingFactory(BillType.MEAL);
        double mealAmount = meal.totalAmount(billInput.getMealCount());
        double mealGST =  meal.totalGst(billInput.getMealCount());

        Accommodation openSeating = (Accommodation) BillGenerationFactory.getBillingFactory(BillType.OPEN_SEATING);
        double openSeatingPrice = openSeating.totalAmount(billInput.getOpenSeatingCount());
        double openSeatingGST = openSeating.totalGst(billInput.getOpenSeatingCount());
        int freeConferenceRoomHour = openSeating.getTotalFreeConferenceRoomHours(billInput.getOpenSeatingCount());

        Accommodation cabinSeating = (Accommodation) BillGenerationFactory.getBillingFactory(BillType.CABIN_SEATING);
        double cabinSeatingPrice = cabinSeating.totalAmount(billInput.getCabinSeatingCount());
        double cabinSeatingGST = cabinSeating.totalGst(billInput.getCabinSeatingCount());
        int freeConferenceRoomHourFromCabin = cabinSeating.getTotalFreeConferenceRoomHours(billInput.getCabinSeatingCount());

        Accommodation conferenceRoomSeating = (Accommodation) BillGenerationFactory.getBillingFactory(BillType.CONFERENCE_ROOM);
        int chargebleHours = billInput.getConferenceRommHours()- (freeConferenceRoomHour+freeConferenceRoomHourFromCabin);
        double conferenceRoomSeatingPrice = conferenceRoomSeating.totalAmount(chargebleHours);
        double conferenceRoomSeatingGST = conferenceRoomSeating.totalGst(chargebleHours);

        System.out.println( billInput.getOpenSeatingCount() + " Open Seats = "+openSeatingPrice);
        System.out.println( billInput.getCabinSeatingCount() + " Cabin Seats = "+cabinSeatingPrice);
        System.out.println("\n");
        System.out.println( billInput.getConferenceRommHours()+ " hours of Conference Room usage = "+conferenceRoomSeatingPrice);
        System.out.println( billInput.getMealCount() + " Meals = "+mealAmount);
        System.out.println( "Total Amount = " + (mealAmount+conferenceRoomSeatingPrice+cabinSeatingPrice+openSeatingPrice));
        System.out.println( "Total GST = "+(mealGST+openSeatingGST+cabinSeatingGST+conferenceRoomSeatingGST));


    }

}
