package model;

public class BillInput {

    int openSeatingCount;
    int cabinSeatingCount;
    int conferenceRommHours;
    int mealCount;

    public void setCabinSeatingCount(int cabinSeatingCount) {
        this.cabinSeatingCount = cabinSeatingCount;
    }

    public void setConferenceRommHours(int conferenceRommHours) {
        this.conferenceRommHours = conferenceRommHours;
    }

    public void setMealCount(int mealCount) {
        this.mealCount = mealCount;
    }

    public void setOpenSeatingCount(int openSeatingCount) {
        this.openSeatingCount = openSeatingCount;
    }

    public int getCabinSeatingCount() {
        return cabinSeatingCount;
    }

    public int getConferenceRommHours() {
        return conferenceRommHours;
    }

    public int getMealCount() {
        return mealCount;
    }

    public int getOpenSeatingCount() {
        return openSeatingCount;
    }
}
