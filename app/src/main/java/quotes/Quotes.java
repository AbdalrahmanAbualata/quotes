package quotes;


public class Quotes {
    private String author;
    private String text;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        String msg ="Today's Quote: " +
                "Quote: " + text +
                "author: " + author ;
        return msg ;
    }
}
