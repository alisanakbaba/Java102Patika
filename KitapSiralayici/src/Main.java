import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>();   // TreeSet i polymorphism ile oluşturduk

        // Verileri oluşturduğumuz veri yapısına ekledik
        books.add(new Book("Sefiller",480,"Victor Hugo",1870));
        books.add(new Book("Korkunç Yıllar",230,"Cengiz Dağcı",1960));
        books.add(new Book("Osmancık",390,"Tarık Buğra",1920));
        books.add(new Book("Açlık",200,"Knut Hamsun",1970));
        books.add(new Book("Abumrabum",500,"İskender Pala",1980));

        for(Book book:books){
            System.out.println(book.getBookName());
        }

        // Sayfa sayısına göre sıralanması için yeniden TreeSet oluşturduk ve sayfa sayısına göre karşılaştırmasını sağladık
        Set<Book> books2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber()-o2.getPageNumber();
            }
        });

        // önceki verilerin tamamını bu yeni yapımıza ekledik
        books2.addAll(books);

        for(Book book:books2){
            System.out.println(book.getBookName());
        }
    }
}