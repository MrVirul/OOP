package FinalModelPaper.Question02;

public class Driver {
     String driverName;
     String LicenceNumber;

    public Driver(String driverName, String licenceNumber) {
        this.driverName = driverName;
        LicenceNumber = licenceNumber;
    }

    public void displayDriverDetails(){
        System.out.println("Driver Name is : " + driverName + "\nDriver Licence is :" + LicenceNumber);
    }

}
