package solidWithDesignPattern;

public class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    void borrowResource( ResourceType resourceType) {
        resourceType.borrow(this.getName());
    }

}
