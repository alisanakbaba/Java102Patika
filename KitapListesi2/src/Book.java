public class Book {
    private String bookName;
    private int pageNumber;
    private String authorName;
    private int publicationDate;

    public Book(String bookName,int pageNumber,String authorName,int publicationDate){
        this.bookName=bookName;
        this.pageNumber=pageNumber;
        this.authorName=authorName;
        this.publicationDate=publicationDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }
}
