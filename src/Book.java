import java.util.Objects;

public class Book {

    String Author;
    String Title;

    public Book(String Author,String Title){

        this.Author=Author;
        this.Title=Title;

    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || getClass()!=o.getClass())
            return false;
                Book book = (Book) o;
            return Author.equals(book.Author) && Title.equals(book.Title);
        }

    public static void main(String[] args) {
        Book b1 = new Book("AK","Cool");
        Book b2 = new Book("AK","Cool");
        System.out.println(b1.equals(b2)); //
    }

    @Override
    public int hashCode(){
        return Objects.hash(Author, Title);
    }



}
