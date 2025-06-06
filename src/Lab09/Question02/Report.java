package Lab09.Question02;

public class Report implements Printable{

    String title;

    public Report(String title) {
        this.title = title;
    }

    @Override
    public void displayDetails() {
        System.out.println("Report title is : " + title);
    }

}
