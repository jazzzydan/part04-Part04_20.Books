public class Book {
    private String title;
    private int nrOfPages;
    private int publicationYear;

    public Book(String title, int nrOfPages, int publicationYear) {
        this.title = title;
        this.nrOfPages = nrOfPages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.nrOfPages + " pages, " + this.publicationYear;
    }
}
