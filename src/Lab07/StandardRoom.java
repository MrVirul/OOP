package Lab07;

class StandardRoom extends Room
{
  private boolean hasWiFi;

  //parent class constructor 
  public StandardRoom(int roomNumber, String guestName, int numberOfNights, boolean hasWiFi) {
    super(roomNumber, guestName, numberOfNights);
    this.hasWiFi = hasWiFi;
  }
  @Override
  public double calculateRoomCost(){
    return super.calculateRoomCost()*100;
  }

 @Override
 public void displayRoomDetails(){
    super.displayRoomDetails();
    System.out.println("Has WiFi: " + hasWiFi);
  }
 
}