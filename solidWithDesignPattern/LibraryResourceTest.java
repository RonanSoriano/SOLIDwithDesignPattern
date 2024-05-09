package solidWithDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class LibraryResourceTest {
    public static void main(String[] args){

        Student student1 = new Student("Ronan");
        Student student2 = new Student("Chuwu");
        Student student3 = new Student("Gewonks");

        Map<String, ResourceBorrower> resourceFactory = new HashMap<>();

        resourceFactory.put("book", new ResourceType());
        Resource book = new Resource("book", "How to Train your Dragon");

        resourceFactory.put("audio book", new ResourceType());
        Resource audioBook = new Resource("audio book", "Heartless Villain - The Mate Games");

        resourceFactory.put("thesis", new ResourceType());
        Resource thesis = new Resource("thesis", "Prevention and Treatment of Chronic Brain Injury.");

        resourceFactory.put("journal", new ResourceType());
        Resource journal = new Resource("journal", "How I Become Rich at 21 years old");


        ResourceProcessor resourceProcessor = new ResourceProcessor(resourceFactory);

        resourceProcessor.borrowResource(student1, book);
        System.out.println();

        resourceProcessor.borrowResource(student2, audioBook);
        System.out.println();

        resourceProcessor.borrowResource(student3, journal);
        System.out.println();

        resourceProcessor.borrowResource(student2, thesis);

    }
}
