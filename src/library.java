import java.util.*;

public class Library {
    private Map<String, Book> books;
    private Map<String, Member> members;

    public Library() {
        books = new HashMap<>();
        members = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public void addMember(Member member) {
        members.put(member.getId(), member);
    }

    public Book getBook(String bookId) {
        return books.get(bookId);
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Members> getMembers() {
        return members;
    }

    public Member getMember(String memberId) {
        return members.get(memberId);
    }

    public void borrowBook(String memberId, String bookId) {
        Member member = getMember(memberId);
        Book book = getBook(bookId);
        if (member != null && book != null && book.isAvailable()) {
            member.borrowBook(book);
            System.out.println(member.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println("Book is not available or member not found.");
        }
    }

    public void returnBook(String memberId, String bookId) {
        Member member = getMember(memberId);
        Book book = getBook(bookId);
        if (member != null && book != null && member.getBorrowedBooks().contains(book)) {
            member.returnBook(book);
            System.out.println(member.getName() + " returned " + book.getTitle());
        } else {
            System.out.println("Return failed (book not borrowed or member/book not found).");
        }
    }

    public void listBooks() {
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }

    public void listMembers() {
        for (Member member : members.values()) {
            System.out.println(member);
        }
    }
}