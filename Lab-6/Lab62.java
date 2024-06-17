class Book {
    protected String authorName;

    public Book(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void display() {
        System.out.println("Author: " + authorName);
    }
}

class BookPublication extends Book {
    private String title;

    public BookPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Book Title: " + title + ", Author: " + getAuthorName());
    }
}

class PaperPublication extends Book {
    private String title;

    public PaperPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Paper Title: " + title + ", Author: " + getAuthorName());
    }
}

public class Lab62{
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java Main <author_name> <publication_type> <title>");
            return;
        }

        String author = args[0];
        String pubType = args[1];
        String title = args[2];

        Book publication;

        if (pubType.equals("book")) {
            publication = new BookPublication(author, title);
        } else if (pubType.equals("paper")) {
            publication = new PaperPublication(author, title);
        } else {
            System.out.println("Invalid publication type. Please enter 'book' or 'paper'.");
            return;
        }

        publication.display();
    }
}