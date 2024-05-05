package solidWithDesignPattern;

public class Book implements ResourceType {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public void borrow(String name){
        System.out.println(name + " borrowed book titled: " + title);
    }
}
