public class PhysicalBook extends Book{
    private String shelfLocation;

    public PhysicalBook(String title, String author, String shelfLocation){
        super(title, author);
        this.shelfLocation = shelfLocation;
    }

    public String getShelfLocation() {
        return shelfLocation;
    }

    @Override
    public String toString() {
        return super.toString() + ",書名：" + shelfLocation;
    }
}
