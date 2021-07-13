package core;

public class ConferenceAccommodation extends  Accommodation {

    private static final int PRICE = 200;

    public double price() {
        return PRICE;
    }

    @Override
    public int getFreeConferenceRoomHours() {
        return 0;
    }
}
