import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> bookCase = new ArrayList<>();

        Book b1 = new Book("Şeker Portakalı",250,"Jose Mauro",1968);
        Book b2 = new Book("İnsanlığımı Kaybedişim",300,"Osamu Dazai",1948);
        Book b3 = new Book("Gece Yarısı Kütüphanesi",350,"Matt Haig",2020);
        Book b4 = new Book("Semerkant",390,"Amin Maalouf",1988);
        Book b5 = new Book("Seninle Başlamadı",370,"Mark Volynn",2016);
        Book b6 = new Book("Suç ve Ceza",330,"Dostoyevski",1866);
        Book b7 = new Book("Çavdar Tarlasında Çocuklar",80,"JD Salinger",1951);
        Book b8 = new Book("Martin Eden",90,"Jack London",1909);
        Book b9 = new Book("Simyacı",70,"Paulo Coelho",1988);
        Book b10 = new Book("Kürk Mantolu Modanna",400,"Sabahttin Ali",1943);

        bookCase.add(b1);bookCase.add(b2);bookCase.add(b3);bookCase.add(b4);bookCase.add(b5);
        bookCase.add(b6);bookCase.add(b7);bookCase.add(b8);bookCase.add(b9);bookCase.add(b10);

        Map<String,String> m1 = bookCase.stream().collect(Collectors.toMap(Book::getBookName,Book::getAuthorName));

        List<Book>filteredBooks = bookCase.stream().filter(book -> book.getPageNumber()>100).toList();

        System.out.println(m1);
        filteredBooks.stream().forEach(book->System.out.println(book.getBookName()));




    }
}