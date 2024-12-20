import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("新增書籍: " + book.getTitle());
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("新增會員: " + member.getName());
    }

    public void listBooks() {
        System.out.println("圖書館現有書籍:");
        if (books.isEmpty()) {
            System.out.println("無書籍。");
        } else {
            for (Book book : books) {
                System.out.println("  - " + book.getTitle());
            }
        }
    }

    public Member getMember(String name) {
        for (Member member : members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }
}