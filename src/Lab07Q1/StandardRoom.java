package Lab07Q1;

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
     System.out.println();
  System.out.println("__Standard Room__");
    super.displayRoomDetails();
    System.out.println("Has WiFi: " + hasWiFi);
    System.out.println("Room Cost for Standard Room: " + calculateRoomCost());
  }
 
}