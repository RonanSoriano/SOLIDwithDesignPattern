package solidWithDesignPattern;

public class Journal implements ResourceType {
    private final String title;

    public Journal(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public void borrow(String name){
        System.out.println(name + " borrowed journal titled: " + title);
    }
}
