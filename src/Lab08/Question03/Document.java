package Lab08.Question03;

public class Document {
    protected String title;
    protected String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void displayDocument(){
        System.out.println("Document title is : " + title);
        System.out.println("Document content is : " + content);
    }

}
