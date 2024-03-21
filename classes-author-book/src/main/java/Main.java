public class Main {
    public static void main(String[] args) {
        Author author = new Author("Waldemar", "warshard1337@gmail.com", 'm');
        Book book = new Book("Tom Sawyer", author, 399, 123);

        System.out.println(author.toString());
        System.out.println(book.toString());
    }
}
