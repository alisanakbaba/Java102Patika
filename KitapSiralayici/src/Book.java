public class Book implements Comparable<Book>{
    // Comparable ı implements ettiğimiz için ilgili fonkisyonu override etmek zorundayız
    @Override
    public int compareTo(Book otherBook) {
        return this.bookName.compareTo(otherBook.getBookName());
    }

    // Değişkenleri tanımladık
    private String bookName;
    private int pageNumber;
    private String author;
    private int publicationDate;

    // yapıcı metodumuzu oluşturduk
    public Book(String bookName,int pageNumber,String author,int publicationDate){
        this.bookName=bookName;
        this.pageNumber=pageNumber;
        this.author=author;
        this.publicationDate=publicationDate;
    }

    // Değişkenlerin get ve set metodlarını oluşturduk
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }




}
