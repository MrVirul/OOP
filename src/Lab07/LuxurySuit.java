package Lab07;

class LuxurySuit extends Room{

    boolean hasBreakfast;

    public LuxurySuit(int roomNumber, String guestName, int numberOfNights, boolean hasWiFi, boolean hasBreakfast){
        super(roomNumber, guestName, numberOfNights);
        this.hasBreakfast = hasBreakfast;
    }

    @Override
    public double calculateRoomCost(){
        return super.calculateRoomCost() * 200 + 75.0;
    }

    @Override
    public void displayRoomDetails(){
        super.displayRoomDetails();
        System.out.println("Has Breakfast: " + hasBreakfast);
        System.out.println("Room Cost: " + calculateRoomCost());
    }
}
