package Lab07;

class LuxurySuit extends Room{

    boolean hasBreakfast;

    public LuxurySuit(int roomNumber, String guestName, int numberOfNights, boolean hasWiFi, boolean hasBreakfast){
        super(roomNumber, guestName, numberOfNights);
        this.hasBreakfast = hasBreakfast;
    }
}
