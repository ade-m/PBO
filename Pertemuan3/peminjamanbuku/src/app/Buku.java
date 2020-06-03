package app;

public class Buku {
    private String title,writer;

    public Buku(){}
    public Buku(String title, String writer) {
        this.title = title;
        this.writer = writer;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return this.writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }


    @Override
    public String toString() {
        return "{" +
            " title='" + getTitle() + "'" +
            ", writer='" + getWriter() + "'" +
            "}";
    }



}