package Lab09.Question02;

public class Report implements Printable{
    private String title;

    public Report(String title) {
        this.title = title;
    }

    @Override
    public void printDetails() {
        System.out.println("Report title is : " + title);

    }
}
