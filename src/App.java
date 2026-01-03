import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /*- Classes for Book, Member, and Library
- Store data in ArrayLists or text files
- Allow searching by book title or author */
    }

    public static void searchBooks() {
        public List<Book> books = Library.listBooks(); // Book class must be imported 
        /*
        search = ""
    print("Search. press [Enter] to exit):")
    while True:
        clear_console()
        print(f"Search: {search}")
        found = False
        for name, info in contacts.items():
            if (search.lower() in name.lower() or
                search.lower() in info.get('phone', '').lower() or
                search.lower() in info.get('email', '').lower()):
                print(f"- {name}: {info}")
                found = True
        if not found and search:
            print("No results found.")

        print("\nType your search. [Backspace to delete, Enter to quit]")
        ch = getch()
        #handle Enter key 
        if ch in ('\r', '\n'):
            break
        #handle Backspace 
        elif ch in ('\x08', '\x7f'):
            search = search[:-1]
        #ignore special keys 
        elif len(ch) == 1 and ch.isprintable():
            search += ch
        */ 
       // this must be converted from python to java. 
    }

    public static void searchMembers() {

        public List<Member> members = Library.getMembers();
        // same thing above but with search members
    }

    public static void addBook(String id, String title, String author) {
        public Book book = Book(id, title, author);
        Library.addBook(book);
        // incorrect, must be fixed later

    }

    public static void deleteBook() {

    }

    public static void addMember() {

    }

    public static void deleteMember() {

    }

    public static void editMember() {

    }
}
