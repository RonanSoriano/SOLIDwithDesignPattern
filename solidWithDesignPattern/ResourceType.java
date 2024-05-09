package solidWithDesignPattern;

public class ResourceType implements ResourceBorrower {
    public void borrowResource(Student student, Resource resource) {
        System.out.println(student.getName() + " borrowed " + resource.getResourceType() + " titled: " + resource.getTitle());
    }
}
